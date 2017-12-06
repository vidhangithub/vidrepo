package com.vidhan.creational;




	interface INRpoert
	{
		void processINReport();
	}
	
	class GeneralAgent implements INRpoert{

		public void processINReport() {
			System.out.println("ProcessReport for General agent");
			
		}
		
	}
	
	class RegisteredConsultant implements INRpoert{

		public void processINReport() {
			System.out.println("ProcessReport for RegisteredConsultant");
			
		}
		
	}
	
	
	class RegisteredFirm implements INRpoert{

		public void processINReport() {
			System.out.println("ProcessReport for RegisteredFirm");
			
		}
		
	}
	
	
	
	
	
	interface OUTReport
	{
		void processOUTReport();
	}
	
	class Broker implements OUTReport{

		public void processOUTReport() {
			System.out.println("ProcessReport for Broker");
			
		}
		
	}
	
	class ExternalConsultant implements OUTReport{

		public void processOUTReport() {
			System.out.println("ProcessReport for ExternalConsultant");
			
		}
		
	}
	
	
	class ExternalFirm implements OUTReport{

		public void processOUTReport() {
			System.out.println("ProcessReport for ExternalFirm");
			
		}
		
	}
	
	
	
	
	
	abstract class INOUTReportFactory{
		abstract INRpoert getINReportInstance(String employeeType);
		abstract OUTReport getOUTReportInstance(String employeeType);
		
	}
	
	
	
	
	
	
	class INReportFcartory extends INOUTReportFactory{

		INRpoert getINReportInstance(String employeeType) {
			if (employeeType == null) {
				return null;
			}
			
			if (employeeType.equalsIgnoreCase("GeneralAgent")) {
				INRpoert inreport = new GeneralAgent();
				return inreport;
			}
			if (employeeType.equalsIgnoreCase("RegisteredConsultant")) {
				INRpoert inreport = new RegisteredConsultant();
				return inreport;
			}
			if (employeeType.equalsIgnoreCase("RegisteredFirm")) {
				INRpoert inreport = new RegisteredFirm();
				return inreport;
			}
			return null;
		}

		OUTReport getOUTReportInstance(String employeeType) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	
	
	
	class OUTReportFactory extends INOUTReportFactory{

		INRpoert getINReportInstance(String employeeType) {
			// TODO Auto-generated method stub
			return null;
		}

		OUTReport getOUTReportInstance(String employeeType) {
			OUTReport outReport  = null;
			if (employeeType == null) {
				return null;
			}
			
		    if (employeeType.equalsIgnoreCase("Broker")) {
		    	outReport = new Broker();
				return outReport;
			}
		
		    if (employeeType.equalsIgnoreCase("ExternalConsultant")) {
		    	outReport = new ExternalConsultant();
				return outReport;
			}
		
		    if (employeeType.equalsIgnoreCase("ExternalFirm")) {
		    	outReport = new ExternalFirm();
				return outReport;
			}
		
			return outReport;
		}
		
	}
	
class ReportFactoryProducer  {
	
	
	public static INOUTReportFactory getFactoryInstance(String reportType){
		if (reportType.equalsIgnoreCase("inreport")) {
			INOUTReportFactory inoutReportFactory = new INReportFcartory();
			return inoutReportFactory;
		}
		if (reportType.equalsIgnoreCase("outreport")) {
			INOUTReportFactory inoutReportFactory = new OUTReportFactory();
			return inoutReportFactory;
		}
	return null;
	}
}




public class AbstractFactoryPattern {

	public static void main(String[] args) {

		INOUTReportFactory inreportFctory = ReportFactoryProducer.getFactoryInstance("inReport");
		INRpoert inreport = inreportFctory.getINReportInstance("GeneralAgent");
		inreport.processINReport();
		
	}

}
