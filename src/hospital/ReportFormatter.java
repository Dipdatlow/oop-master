package hospital;

public class ReportFormatter {
	String convertObjectToXML;
	String convertObjectToCSV;
	public ReportFormatter(String convertObjectToXML, String convertObjectToCSV) {
		this.convertObjectToXML = convertObjectToXML;
		this.convertObjectToCSV = convertObjectToCSV;
	}
	
	public void getFormattedValue() {
		System.out.println("getting value...");
	}
}
