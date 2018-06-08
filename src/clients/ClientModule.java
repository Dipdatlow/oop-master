package clients;

import domain.Employee;
import domainDAO.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {
	
	public static void main(String args[]) {
		
		Employee cris = new Employee(17, "Chris", "Tech", true);
		ClientModule.hireEmployee(cris);
		
		printEmployeeReport(cris, FormatType.XML);
		
	}
	
	public static void hireEmployee(Employee employee) {
		EmployeeDAO empDao = new EmployeeDAO();
		empDao.saveEmployee(employee);
	}

	public static void terminateEmployee(Employee employee) {
		EmployeeDAO empDao = new EmployeeDAO();
		empDao.deleteEmployee(employee);
	}
	public static void printEmployeeReport(Employee employee, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}
}
