package com.excelacom.jdbc.curdtest;

public class StudentBean {

	private String sname;
	private String rollNo;
	private String fname;
	private String mname;
	private BookBean bookbean;
	private AddressBean addressBean;
	/**
	 * @return the sname
	 */
	public final String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public final void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the rollNo
	 */
	public final String getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public final void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the fname
	 */
	public final String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public final void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the mname
	 */
	public final String getMname() {
		return mname;
	}
	/**
	 * @param mname the mname to set
	 */
	public final void setMname(String mname) {
		this.mname = mname;
	}
	/**
	 * @return the bookbean
	 */
	public final BookBean getBookbean() {
		return bookbean;
	}
	/**
	 * @param bookbean the bookbean to set
	 */
	public final void setBookbean(BookBean bookbean) {
		this.bookbean = bookbean;
	}
	/**
	 * @return the addressBean
	 */
	public final AddressBean getAddressBean() {
		return addressBean;
	}
	/**
	 * @param addressBean the addressBean to set
	 */
	public final void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}
	
	
}
