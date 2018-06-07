package hospital;

public class EmployeeReportFormatter extends ReportFormatter {
	Employee anEmployee;
	String formatType;
	public EmployeeReportFormatter(Employee anEmployee, String formatType) {
		super(formatType, formatType);
		this.anEmployee = anEmployee;
		this.formatType = formatType;
	}
	public void getFormattedEmployee() {
		System.out.println("getting formatted employee report...");
	}
}
