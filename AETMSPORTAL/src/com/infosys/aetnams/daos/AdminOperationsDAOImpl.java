package com.infosys.aetnams.daos;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.constants.PortalConstant;
import com.infosys.aetnams.pojos.Admin;
import com.infosys.aetnams.pojos.Backlog;
import com.infosys.aetnams.pojos.Employee;
import com.infosys.aetnams.pojos.OffBoardingProcess;
import com.infosys.aetnams.pojos.OnBoardingProcess;
import com.infosys.aetnams.pojos.Shift;
import com.infosys.aetnams.queries.AdminOperationsQueries;
import com.infosys.aetnams.queries.ShiftOperationsQueries;
import com.infosys.aetnams.rowmappers.AdminRowMapper;
import com.infosys.aetnams.rowmappers.EmployeeRowMapper;
import com.infosys.aetnams.rowmappers.OffBoardingProcessRowMapper;
import com.infosys.aetnams.rowmappers.OnBoardingProcessRowMapper;
import com.infosys.aetnams.utils.DatePicking;
import com.infosys.aetnams.utils.NoOfMonday;

public class AdminOperationsDAOImpl implements AdminOperationsDAO {

	// private ModelAndView mav = null;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private ModelAndView mav = null;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	HttpSession session = null;

	@Override
	public ModelAndView getAdminDetails(HttpServletRequest req,
			HttpServletResponse res) {

		try {
			session = req.getSession();
			if (session.getAttribute("INFYID") == null) {
				String password = req.getParameter("pswrd");
				String infyId = req.getParameter("infyid");

				Admin admin = (Admin) jdbcTemplate.queryForObject(
						AdminOperationsQueries.GET_ADMIN_DETAILS,
						new Object[] { infyId }, new AdminRowMapper());

				if (password.equals(admin.getPassword())) {
					session.setAttribute("INFYID", infyId);

					mav = new ModelAndView("adminDataUpload", "SCSMSG",
							PortalConstant.LOGINSUCCESSMSG);
				} else {
					mav = new ModelAndView("login", "ERRMSG",
							PortalConstant.LOGINFAILUREMSG);
				}
			}

		} catch (Exception e) {

			String failuerMSG = "YOU are not Authorized to proceed";
			System.out.println("Exception in DAOIMPL");

			e.printStackTrace();
			mav = new ModelAndView("login", "ERRMSG", failuerMSG);
		}

		return mav;

	}

	@Override
	public ModelAndView getOnBoardDetails(HttpServletRequest req,
			HttpServletResponse res) {

		try {

			String infosysId = req.getParameter("infosysid");

			try {
				OnBoardingProcess onBoardingProcess1 = (OnBoardingProcess) jdbcTemplate
						.queryForObject(
								AdminOperationsQueries.UPDATE_ONBOARD_ALL_YES_CHECK,
								new Object[] { infosysId },
								new OnBoardingProcessRowMapper());
				if (onBoardingProcess1.getEmployeeName() != null) {
					System.out.println(onBoardingProcess1.getEmployeeName()
							+ "complete");
					jdbcTemplate
							.update(AdminOperationsQueries.UPDATE_COMPLETION_IND_TO_YES,
									new Object[] { "yes",
											onBoardingProcess1.getEmployeeId() });

				}
			} catch (Exception e) {
				System.out.println("do nothing.....");
			}

			OnBoardingProcess onBoardingProcess = (OnBoardingProcess) jdbcTemplate
					.queryForObject(AdminOperationsQueries.GET_ONBOARD_DETAILS,
							new Object[] { infosysId },
							new OnBoardingProcessRowMapper());

			if (onBoardingProcess.getEmployeeName() != null
					|| onBoardingProcess.getCompletionIndicator() != null) {

				System.out.println(onBoardingProcess.getEmployeeName());
				mav = new ModelAndView("onBoardDataUpload", "ONBOARD",
						onBoardingProcess);
			} else {
				mav = new ModelAndView("adminDataUpload", "ERRMSG",
						PortalConstant.DATAUPLOADERROR);
			}

			return mav;

		}

		catch (EmptyResultDataAccessException em) {

			String infosysId = req.getParameter("infosysid");
			// String name=req.getParameter("name");
			Date today = Calendar.getInstance().getTime();
			String lastUpdatedBy = (String) session.getAttribute("INFYID");

			System.out.println(lastUpdatedBy + ".....");
			jdbcTemplate.update(AdminOperationsQueries.INSERT_ONBOARD_DETAILS,
					new Object[] { infosysId, "", "no", "no", "no", "no", "no",
							"no", "no", "no", "no", "no", "no", "no", "no",
							"no", "no", "no", "no", "no", "no", "no", "no",
							today, today, lastUpdatedBy, "no" });

			OnBoardingProcess onBoardingProcess = (OnBoardingProcess) jdbcTemplate
					.queryForObject(AdminOperationsQueries.GET_ONBOARD_DETAILS,
							new Object[] { infosysId },
							new OnBoardingProcessRowMapper());

			mav = new ModelAndView("onBoardDataUpload", "ONBOARD",
					onBoardingProcess);

			return mav;
		}

		catch (Exception e) {

			System.out.println("Exception in DAOIMPL..........hello");

			e.printStackTrace();
			mav = new ModelAndView("adminDataUpload", "ERRMSG",
					PortalConstant.DATAUPLOADERROR);
			return mav;
		}

	}

	@Override
	public ModelAndView saveOnBoardDetails(HttpServletRequest req,
			HttpServletResponse res) {

		try {
			Date today = Calendar.getInstance().getTime();
			// String lastUpdatedBy=(String) session.getAttribute("INFYID");

			String employeeId = req.getParameter("employeeId");
			String employeeName = req.getParameter("employeeName");
			String welcomeLetter = req.getParameter("welcomeLetter");

			String ndaITBGcheck = req.getParameter("ndaITBGcheck");
			String ndaITsigned = req.getParameter("ndaITsigned");
			String doorAcess = req.getParameter("doorAcess");
			String applyForNIDacms = req.getParameter("applyForNIDacms");
			String allocateBFFRProjCode = req
					.getParameter("allocateBFFRProjCode");
			String mailToSPOCforNID = req.getParameter("mailToSPOCforNID");
			String lanAccess = req.getParameter("lanAccess");
			String compAndOnboardKit = req.getParameter("comp&OnboardKit");
			String ndaFormScanAndUpload = req
					.getParameter("ndaFormScan&Upload");
			String teamTrackerUpdate = req.getParameter("teamTrackerUpdate");
			String addedToMailList = req.getParameter("addedToMailList");
			String compMandTrainng = req.getParameter("compMandTrainng");
			String fwdAllocatnALCON = req.getParameter("fwdAllocatnALCON");
			String mapActvtyToDART = req.getParameter("mapActvtyToDART");
			String reqVMAllocatn = req.getParameter("reqVMAllocatn");
			String reqForSWInstall = req.getParameter("reqForSWInstall");
			String reqForNSAUpload = req.getParameter("reqForNSAUpload");
			String checkForGoalSet = req.getParameter("checkForGoalSet");
			String chckForLateStay = req.getParameter("chckForLateStay");
			String deskAllocatn = req.getParameter("deskAllocatn");

			String lastUpdatedBy = (String) session.getAttribute("INFYID");
			jdbcTemplate.update(AdminOperationsQueries.UPDATE_ONBOARD_DETAILS,
					new Object[] { employeeName, welcomeLetter, ndaITBGcheck,
							ndaITsigned, doorAcess, applyForNIDacms,
							allocateBFFRProjCode, mailToSPOCforNID, lanAccess,
							compAndOnboardKit, ndaFormScanAndUpload,
							teamTrackerUpdate, addedToMailList,
							compMandTrainng, fwdAllocatnALCON, mapActvtyToDART,
							reqVMAllocatn, reqForSWInstall, reqForNSAUpload,
							checkForGoalSet, chckForLateStay, deskAllocatn,
							today, lastUpdatedBy, "no", employeeId });

			try {

				OnBoardingProcess onBoardingProcess1 = (OnBoardingProcess) jdbcTemplate
						.queryForObject(
								AdminOperationsQueries.UPDATE_ONBOARD_ALL_YES_CHECK,
								new Object[] { employeeId },
								new OnBoardingProcessRowMapper());
				if (onBoardingProcess1.getEmployeeName() != null) {
					System.out.println(onBoardingProcess1.getEmployeeName()
							+ "complete");
					jdbcTemplate
							.update(AdminOperationsQueries.UPDATE_COMPLETION_IND_TO_YES,
									new Object[] { "yes",
											onBoardingProcess1.getEmployeeId() });

					OnBoardingProcess onBoardingProcess = (OnBoardingProcess) jdbcTemplate
							.queryForObject(
									AdminOperationsQueries.GET_ONBOARD_DETAILS,
									new Object[] { employeeId },
									new OnBoardingProcessRowMapper());

					mav = new ModelAndView("onBoardDataUpload", "ONBOARD",
							onBoardingProcess);

					return mav;
				}
			} catch (Exception e) {
				System.out.println("do nothing.....");
			}

			mav = new ModelAndView("adminDataUpload", "DATASAVESCSMSG",
					PortalConstant.DATASAVESUCCESSMSG);

			return mav;

		} catch (Exception e) {

			System.out.println("Exception in DAOIMPL");

			e.printStackTrace();
			mav = new ModelAndView("login", "ERRMSG",
					"Error during onboarding data update");
		}

		return mav;

	}

	@Override
	public ModelAndView insertEmpDetails(HttpServletRequest req,
			HttpServletResponse res) {

		try {

			String employeeId = req.getParameter("empId");
			String employeeName = req.getParameter("empName");

			Employee employee = (Employee) jdbcTemplate
					.queryForObject(
							AdminOperationsQueries.GET_EMPLOYEE_DETAILS,
							new Object[] { employeeId, employeeName },
							new EmployeeRowMapper());

			mav = new ModelAndView("employeeDataUpload", "EMPDATA", employee);

			return mav;

		}

		catch (EmptyResultDataAccessException e) {

			String employeeId = req.getParameter("empId");
			String employeeName = req.getParameter("empName");
			jdbcTemplate.update(AdminOperationsQueries.INSERT_EMPLOYEE_DETAILS,
					new Object[] { employeeId, employeeName, " " });

			Employee employee = (Employee) jdbcTemplate
					.queryForObject(
							AdminOperationsQueries.GET_EMPLOYEE_DETAILS,
							new Object[] { employeeId, employeeName },
							new EmployeeRowMapper());

			mav = new ModelAndView("employeeDataUpload", "EMPDATA", employee);

			return mav;
		}

		catch (Exception e) {

			String failuerMSG = "YOU are not Authorized to proceed";
			System.out.println("Exception in DAOIMPL");

			e.printStackTrace();
			mav = new ModelAndView("login", "ERRMSG", failuerMSG);
		}

		return mav;

	}

	// empDataSave
	@Override
	public ModelAndView empDataSave(HttpServletRequest req,
			HttpServletResponse res) {

		try {

			String employeeId = req.getParameter("employeeId");

			String aetnaEmailId = req.getParameter("aetnaEmailId");
			String infyEmailId = req.getParameter("infyEmailId");
			String nid = req.getParameter("nid");
			String pm = req.getParameter("pm");
			String primaryDomain = req.getParameter("primaryDomain");
			String designation = req.getParameter("designation");
			String primarySkillSet = req.getParameter("primarySkillSet");
			String crossTraining = req.getParameter("crossTraining");
			String application = req.getParameter("application");
			String passportNo = req.getParameter("passportNo");
			jdbcTemplate
					.update(AdminOperationsQueries.UPDATE_EMPLOYEE_DETAILS,
							new Object[] { aetnaEmailId, infyEmailId, nid, pm,
									primaryDomain, designation,
									primarySkillSet, crossTraining,
									application, passportNo, employeeId });

			mav = new ModelAndView("adminDataUpload", "EMPDATASUCCCMSG",
					"Employee Data Successfully updated");

		} catch (Exception e) {

			String failuerMSG = "YOU are not Authorized to proceed";
			System.out.println("Exception in DAOIMPL");

			e.printStackTrace();
			mav = new ModelAndView("login", "ERRMSG", failuerMSG);
		}

		return mav;

	}

	@Override
	public ModelAndView getUploadDetails(
			@RequestParam("file") MultipartFile file, HttpServletRequest req,
			HttpServletResponse res) {

		try {

			byte[] bytes = file.getBytes();

			File dir = new File("c:/" + File.separator + "temp");

			if (!dir.exists())
				dir.mkdirs();

			File serverFile = new File(dir.getAbsolutePath() + File.separator
					+ file.getOriginalFilename());
			BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(serverFile));
			stream.write(bytes);
			stream.close();

			FileInputStream fileInputStream = new FileInputStream(
					serverFile.getAbsoluteFile());

			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet worksheet = workbook.getSheet("Sheet1");

			System.out.println(worksheet.getLastRowNum());
			int rowno = worksheet.getLastRowNum();
			ArrayList<XSSFRow> arrayList = new ArrayList<>();

			for (int k = 1; k <= rowno; k++)

			{

				arrayList.add(worksheet.getRow(k));

			}

			int size = arrayList.size();
			System.out.println(size + "hello");

			ArrayList<XSSFCell> asggrplist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> ticketnolist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> smownerlist = new ArrayList<XSSFCell>();

			ArrayList<XSSFCell> smticketopendatelist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> smstatuslist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> agelist = new ArrayList<XSSFCell>();

			ArrayList<XSSFCell> undertendayslist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> withintentotwentylist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> smlastupdatedlist = new ArrayList<XSSFCell>();

			ArrayList<XSSFCell> lastupdateddaysagolist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> imnolist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> imasggrplist = new ArrayList<XSSFCell>();

			ArrayList<XSSFCell> imstatuslist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> imassigneenamelist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> pnesdglist = new ArrayList<XSSFCell>();

			ArrayList<XSSFCell> adasdglist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> exceptionlist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> cglist = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> agebracketlist = new ArrayList<XSSFCell>();

			ArrayList<String> list1 = new ArrayList<String>();
			ArrayList<String> list2 = new ArrayList<String>();
			ArrayList<String> list3 = new ArrayList<String>();
			ArrayList<java.util.Date> list4 = new ArrayList<java.util.Date>();
			ArrayList<String> list5 = new ArrayList<String>();
			ArrayList<Number> list6 = new ArrayList<Number>();
			ArrayList<Number> list7 = new ArrayList<Number>();
			ArrayList<Number> list8 = new ArrayList<Number>();
			ArrayList<java.util.Date> list9 = new ArrayList<java.util.Date>();
			ArrayList<Number> list10 = new ArrayList<Number>();
			ArrayList<String> list11 = new ArrayList<String>();
			ArrayList<String> list12 = new ArrayList<String>();
			ArrayList<String> list13 = new ArrayList<String>();
			ArrayList<String> list14 = new ArrayList<String>();
			ArrayList<String> list15 = new ArrayList<String>();
			ArrayList<String> list16 = new ArrayList<String>();
			ArrayList<String> list17 = new ArrayList<String>();
			ArrayList<String> list18 = new ArrayList<String>();
			ArrayList<String> list19 = new ArrayList<String>();

			for (int k = 0; k < size; k++) {

				asggrplist.add(arrayList.get(k).getCell((short) 0));
				list1.add(asggrplist.get(k).getStringCellValue());

				ticketnolist.add(arrayList.get(k).getCell((short) 1));
				list2.add(ticketnolist.get(k).getStringCellValue());

				smownerlist.add(arrayList.get(k).getCell((short) 2));
				list3.add(smownerlist.get(k).getStringCellValue());

				smticketopendatelist.add(arrayList.get(k).getCell((short) 3));
				list4.add(smticketopendatelist.get(k).getDateCellValue());

				smstatuslist.add(arrayList.get(k).getCell((short) 4));
				list5.add(smstatuslist.get(k).getStringCellValue());

				agelist.add(arrayList.get(k).getCell((short) 5));
				list6.add(agelist.get(k).getNumericCellValue());

				undertendayslist.add(arrayList.get(k).getCell((short) 6));
				list7.add(undertendayslist.get(k).getNumericCellValue());

				withintentotwentylist.add(arrayList.get(k).getCell((short) 7));
				list8.add(withintentotwentylist.get(k).getNumericCellValue());

				smlastupdatedlist.add(arrayList.get(k).getCell((short) 8));
				list9.add(smlastupdatedlist.get(k).getDateCellValue());

				lastupdateddaysagolist.add(arrayList.get(k).getCell((short) 9));
				list10.add(lastupdateddaysagolist.get(k).getNumericCellValue());

				imnolist.add(arrayList.get(k).getCell((short) 10));
				list11.add(imnolist.get(k).getStringCellValue());

				imasggrplist.add(arrayList.get(k).getCell((short) 11));
				list12.add(imasggrplist.get(k).getStringCellValue());

				imstatuslist.add(arrayList.get(k).getCell((short) 12));
				list13.add(imstatuslist.get(k).getStringCellValue());

				imassigneenamelist.add(arrayList.get(k).getCell((short) 13));
				list14.add(imassigneenamelist.get(k).getStringCellValue());

				pnesdglist.add(arrayList.get(k).getCell((short) 14));
				list15.add(pnesdglist.get(k).getStringCellValue());

				adasdglist.add(arrayList.get(k).getCell((short) 15));
				list16.add(adasdglist.get(k).getStringCellValue());
				exceptionlist.add(arrayList.get(k).getCell((short) 16));
				list17.add(exceptionlist.get(k).getStringCellValue());
				cglist.add(arrayList.get(k).getCell((short) 17));
				list18.add(cglist.get(k).getStringCellValue());
				agebracketlist.add(arrayList.get(k).getCell((short) 18));
				list19.add(agebracketlist.get(k).getStringCellValue());

			}

			jdbcTemplate.update(AdminOperationsQueries.DELETE_BACKLOG_DETAILS);
			for (int k = 0; k < size; k++) {

				Backlog backlog = new Backlog();

				backlog.setAssignment_group(list1.get(k));
				backlog.setSm_number(list2.get(k));
				backlog.setSm_owner_name(list3.get(k));
				java.sql.Date sqlDate1 = new java.sql.Date(list4.get(k)
						.getTime());
				backlog.setSm_open_date(sqlDate1);
				backlog.setSm_status(list5.get(k));
				backlog.setSm_age((Double) list6.get(k));

				backlog.setUnder_ten_days((Double) list7.get(k));
				backlog.setWithin_ten_to_twenty((Double) list8.get(k));

				java.sql.Date sqlDate2 = new java.sql.Date(list9.get(k)
						.getTime());
				backlog.setSm_last_updt_dt(sqlDate2);
				backlog.setSm_last_updt_days_ago((Double) list10.get(k));

				backlog.setIm_number(list11.get(k));
				backlog.setIm_assignment_group(list12.get(k));
				backlog.setIm_status(list13.get(k));
				backlog.setIm_assignee_name(list14.get(k));
				backlog.setPne_sdg(list15.get(k));
				backlog.setAda_sdg(list16.get(k));
				backlog.setException(list17.get(k));
				backlog.setCg(list18.get(k));
				backlog.setAge_bracket(list19.get(k));

				jdbcTemplate.update(
						AdminOperationsQueries.GET_BACKLOG_DETAILS,
						new Object[] { backlog.getAssignment_group(),
								backlog.getSm_number(),
								backlog.getSm_owner_name(),
								backlog.getSm_open_date(),

								backlog.getSm_status(), backlog.getSm_age(),
								backlog.getUnder_ten_days(),
								backlog.getWithin_ten_to_twenty(),
								backlog.getSm_last_updt_dt(),
								backlog.getSm_last_updt_days_ago(),

								backlog.getIm_number(),
								backlog.getIm_assignment_group(),
								backlog.getIm_status(),
								backlog.getIm_assignee_name(),
								backlog.getPne_sdg(), backlog.getAda_sdg(),
								backlog.getException(), backlog.getCg(),
								backlog.getAge_bracket() });

			}

			mav = new ModelAndView("adminDataUpload", "SCSMSG1",
					PortalConstant.DATAUPLOADSUCCESSMSG);
			return mav;

		} catch (Exception e) {

			System.out.println("Exception in DAOIMPL");
			e.printStackTrace();
			mav = new ModelAndView("adminDataUpload", "SCSMSG1",
					PortalConstant.DATAUPLOADERROR);
			return mav;
		}
	}

	// pritam---start----------------------------------------------

	@Override
	public ModelAndView getShiftDetails(
			@RequestParam("file") MultipartFile file, HttpServletRequest req,
			HttpServletResponse res) {

		try {

			byte[] bytes = file.getBytes();

			File dir = new File("c:/" + File.separator + "temp");

			if (!dir.exists())
				dir.mkdirs();

			File serverFile = new File(dir.getAbsolutePath() + File.separator
					+ file.getOriginalFilename());
			BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(serverFile));
			stream.write(bytes);
			stream.close();

			FileInputStream fileInputStream = new FileInputStream(
					serverFile.getAbsoluteFile());

			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet worksheet = workbook.getSheet("Sheet1");

			System.out.println(worksheet.getLastRowNum());
			int rowno = worksheet.getLastRowNum();
			ArrayList<XSSFRow> arrayList = new ArrayList<>();

			for (int k = 1; k <= rowno; k++)

			{

				arrayList.add(worksheet.getRow(k));

			}

			int size = arrayList.size();
			System.out.println(size + "hello");
			int week1 = 0;
			int week2 = 0;
			int week3 = 0;
			int week4 = 0;

			Calendar calendar = new GregorianCalendar();

			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH);
			// int month =Calendar.MARCH;
			int noOfweek = NoOfMonday.getNoOfMondays(month, year);

			if (DatePicking.getDate(Calendar.MONDAY, 1, month, year) != null) {
				week1 = 1;
				week2 = 2;
				week3 = 3;
				week4 = 4;
			} else {
				week1 = 2;
				week2 = 3;
				week3 = 4;
				week4 = 5;

			}

			ArrayList<XSSFCell> infyId = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> empName = new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> stream1 = new ArrayList<XSSFCell>();

			ArrayList<XSSFCell> applications = new ArrayList<XSSFCell>();
			// ArrayList<XSSFCell> date1=new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> shift1 = new ArrayList<XSSFCell>();

			// ArrayList<XSSFCell> date2=new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> shift2 = new ArrayList<XSSFCell>();
			// ArrayList<XSSFCell> date3=new ArrayList<XSSFCell>();

			ArrayList<XSSFCell> shift3 = new ArrayList<XSSFCell>();
			// ArrayList<XSSFCell> date4=new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> shift4 = new ArrayList<XSSFCell>();

			// ArrayList<XSSFCell> date5=new ArrayList<XSSFCell>();
			ArrayList<XSSFCell> shift5 = new ArrayList<XSSFCell>();

			ArrayList<Number> list1 = new ArrayList<Number>();
			ArrayList<String> list2 = new ArrayList<String>();
			ArrayList<String> list3 = new ArrayList<String>();
			ArrayList<String> list4 = new ArrayList<String>();

			ArrayList<java.util.Date> list5 = new ArrayList<java.util.Date>();
			ArrayList<String> list6 = new ArrayList<String>();
			ArrayList<java.util.Date> list7 = new ArrayList<java.util.Date>();
			ArrayList<String> list8 = new ArrayList<String>();
			ArrayList<java.util.Date> list9 = new ArrayList<java.util.Date>();
			ArrayList<String> list10 = new ArrayList<String>();
			ArrayList<java.util.Date> list11 = new ArrayList<java.util.Date>();
			ArrayList<String> list12 = new ArrayList<String>();
			ArrayList<java.util.Date> list13 = new ArrayList<java.util.Date>();
			ArrayList<String> list14 = new ArrayList<String>();

			for (int k = 0; k < size; k++) {

				infyId.add(arrayList.get(k).getCell((short) 0));
				list1.add(infyId.get(k).getNumericCellValue());

				empName.add(arrayList.get(k).getCell((short) 1));
				list2.add(empName.get(k).getStringCellValue());

				stream1.add(arrayList.get(k).getCell((short) 2));
				list3.add(stream1.get(k).getStringCellValue());

				applications.add(arrayList.get(k).getCell((short) 3));
				list4.add(applications.get(k).getStringCellValue());

				list5.add(DatePicking.getDate(Calendar.MONDAY, week1, month,
						year));
				shift1.add(arrayList.get(k).getCell((short) 5));
				list6.add(shift1.get(k).getStringCellValue());

				list7.add(DatePicking.getDate(Calendar.MONDAY, week2, month,
						year));
				shift2.add(arrayList.get(k).getCell((short) 7));
				list8.add(shift2.get(k).getStringCellValue());

				list9.add(DatePicking.getDate(Calendar.MONDAY, week3, month,
						year));
				shift3.add(arrayList.get(k).getCell((short) 9));
				list10.add(shift3.get(k).getStringCellValue());

				list11.add(DatePicking.getDate(Calendar.MONDAY, week4, month,
						year));
				shift4.add(arrayList.get(k).getCell((short) 11));
				list12.add(shift4.get(k).getStringCellValue());

				list13.add(DatePicking.getDate(Calendar.MONDAY, 5, month, year));
				shift5.add(arrayList.get(k).getCell((short) 13));
				list14.add(shift5.get(k).getStringCellValue());

			}

			jdbcTemplate.update(ShiftOperationsQueries.DELETE_SHIFT_DETAILS);
			for (int k = 0; k < size; k++) {

				Shift shift = new Shift();

				shift.setInfyId(list1.get(k));

				shift.setEmpName(list2.get(k));
				shift.setStream(list3.get(k));
				shift.setApplications(list4.get(k));

				java.sql.Date sqlDate1 = new java.sql.Date(list5.get(k)
						.getTime());
				shift.setDate1(sqlDate1);
				shift.setShift1(list6.get(k));

				java.sql.Date sqlDate2 = new java.sql.Date(list7.get(k)
						.getTime());
				shift.setDate2(sqlDate2);
				shift.setShift2(list8.get(k));

				java.sql.Date sqlDate3 = new java.sql.Date(list9.get(k)
						.getTime());
				shift.setDate3(sqlDate3);
				shift.setShift3(list10.get(k));

				java.sql.Date sqlDate4 = new java.sql.Date(list11.get(k)
						.getTime());
				shift.setDate4(sqlDate4);
				shift.setShift4(list12.get(k));
				if (noOfweek == 5) {
					java.sql.Date sqlDate5 = new java.sql.Date(list13.get(k)
							.getTime());
					shift.setDate5(sqlDate5);
					shift.setShift5(list14.get(k));
				}

				if (noOfweek == 5) {
					jdbcTemplate.update(
							ShiftOperationsQueries.GET_SHIFT_DETAILS_V2,
							new Object[] { shift.getInfyId(),
									shift.getEmpName(), shift.getStream(),
									shift.getApplications(), shift.getDate1(),
									shift.getShift1(), shift.getDate2(),
									shift.getShift2(), shift.getDate3(),
									shift.getShift3(), shift.getDate4(),
									shift.getShift4(), shift.getDate5(),
									shift.getShift5() });
				} else {
					jdbcTemplate.update(
							ShiftOperationsQueries.GET_SHIFT_DETAILS,
							new Object[] { shift.getInfyId(),
									shift.getEmpName(), shift.getStream(),
									shift.getApplications(), shift.getDate1(),
									shift.getShift1(), shift.getDate2(),
									shift.getShift2(), shift.getDate3(),
									shift.getShift3(), shift.getDate4(),
									shift.getShift4() });
				}
			}

			mav = new ModelAndView("adminDataUpload", "SCSMSG1",
					PortalConstant.DATAUPLOADSUCCESSMSG);
			return mav;
			// workbook.close();
		} catch (Exception e) {

			System.out.println("Exception in DAOIMPL");
			e.printStackTrace();
			mav = new ModelAndView("adminDataUpload", "SCSMSG1",
					PortalConstant.DATAUPLOADERROR);
			return mav;
		}
	}

	// pritam---end----------------------------------------------------

	@Override
	public ModelAndView getOffBoardDetails(HttpServletRequest req,
			HttpServletResponse res) {

		String infosysId = req.getParameter("infosysid");
		System.out.println(infosysId);

		try {
			OnBoardingProcess onBoardingProcess = (OnBoardingProcess) jdbcTemplate
					.queryForObject(AdminOperationsQueries.GET_ONBOARD_DETAILS,
							new Object[] { infosysId },
							new OnBoardingProcessRowMapper());

			try {
				OffBoardingProcess offBoardingProcess = (OffBoardingProcess) jdbcTemplate
						.queryForObject(
								AdminOperationsQueries.GET_OFFBOARD_DETAILS,
								new Object[] { infosysId },
								new OffBoardingProcessRowMapper());
				mav = new ModelAndView("offBoardDataUpload", "OFFBOARD",
						offBoardingProcess);

				return mav;
			}catch (EmptyResultDataAccessException em) {
				
				
				Date today = Calendar.getInstance().getTime();
				String lastUpdatedBy = (String) session.getAttribute("INFYID");

				System.out.println(lastUpdatedBy + ".....");
				jdbcTemplate.update(AdminOperationsQueries.INSERT_OFFBOARD_DETAILS,
						new Object[] { infosysId, "no", "no", "no", "no",
								today, today, lastUpdatedBy, "no" });
				
				
				OffBoardingProcess offBoardingProcess = (OffBoardingProcess) jdbcTemplate
						.queryForObject(AdminOperationsQueries.GET_OFFBOARD_DETAILS,
								new Object[] { infosysId },
								new OffBoardingProcessRowMapper());
				
				
				
				mav = new ModelAndView("offBoardDataUpload", "OFFBOARD",
						offBoardingProcess);

				return mav;
				
				
			}catch (Exception e) {
				mav = new ModelAndView("adminDataUpload", "OFFBOARDSMSG",
						"Exception Occured");

				return mav;
			}

			
		} catch (Exception e) {

			System.out.println("No Employee Found");
			mav = new ModelAndView("adminDataUpload", "OFFBOARDSMSG",
					"Sorry no such employee exists");

			return mav;
		}

	}
	
	@Override
	public ModelAndView saveOffBoardDetails(HttpServletRequest req,
			HttpServletResponse res) {

		try {
			Date today = Calendar.getInstance().getTime();

			String employeeId = req.getParameter("employeeId");
			String doorAccessRevoke = req.getParameter("dooraccess");
			String nidDeactivate = req.getParameter("niddeactivate");
			String revokeLanAccess = req.getParameter("lanrevoke");
			String removeFromMailingList = req.getParameter("removemailinglist");

			String lastUpdatedBy = (String) session.getAttribute("INFYID");
			jdbcTemplate.update(AdminOperationsQueries.UPDATE_OFFBOARD_DETAILS,
					new Object[] { doorAccessRevoke, nidDeactivate, revokeLanAccess,
							removeFromMailingList, today, lastUpdatedBy, "no", employeeId });

			try {

				OffBoardingProcess offBoardingProcess = (OffBoardingProcess) jdbcTemplate
						.queryForObject(
								AdminOperationsQueries.UPDATE_OFFBOARD_ALL_YES_CHECK,
								new Object[] { employeeId },
								new OffBoardingProcessRowMapper());
				
					jdbcTemplate.update(AdminOperationsQueries.UPDATE_OFFBOARD_COMPLETION_IND_TO_YES,
									new Object[] { "yes",offBoardingProcess.getEmployeeId() });

					OffBoardingProcess offBoardingProcessNew = (OffBoardingProcess) jdbcTemplate
							.queryForObject(
									AdminOperationsQueries.GET_OFFBOARD_DETAILS,
									new Object[] { employeeId },
									new OffBoardingProcessRowMapper());
					
					System.out.println(offBoardingProcessNew.getCompletionIndicator());

					mav = new ModelAndView("offBoardDataUpload", "OFFBOARD",offBoardingProcessNew);

					return mav;
				
			} catch (Exception e) {
				System.out.println("do nothing.....");
			}

			mav = new ModelAndView("adminDataUpload", "DATASAVESCSMSG",
					PortalConstant.DATASAVESUCCESSMSG);

			return mav;

		} catch (Exception e) {

			System.out.println("Exception in DAOIMPL");

			e.printStackTrace();
			mav = new ModelAndView("login", "ERRMSG",
					"Error during onboarding data update");
		}

		return mav;

	}
	
	
	@Override
	public ModelAndView deleteEmpDetails(HttpServletRequest req,
			HttpServletResponse res) {

		try {

			String employeeId = req.getParameter("empId");

			jdbcTemplate.update(AdminOperationsQueries.DELETE_EMPLOYEE_DETAILS_OFFBOARD,
					new Object[] { employeeId});
			
			jdbcTemplate.update(AdminOperationsQueries.DELETE_EMPLOYEE_DETAILS_ONBOARD,
					new Object[] { employeeId});
			
			jdbcTemplate.update(AdminOperationsQueries.DELETE_EMPLOYEE_DETAILS_MASTER,
					new Object[] { employeeId});

			mav = new ModelAndView("adminDataUpload", "OFFBOARDSMSG", "Offboard process completed successfully");

			return mav;

		}
		catch (Exception e) {

			String failuerMSG = "YOU are not Authorized to proceed";
			System.out.println("Exception in DAOIMPL");

			e.printStackTrace();
			mav = new ModelAndView("login", "ERRMSG", failuerMSG);
		}

		return mav;

	}

}
