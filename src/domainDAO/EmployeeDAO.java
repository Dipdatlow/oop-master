package domainDAO;

import domain.Employee;

public class EmployeeDAO {
	
	
	public void saveEmployee(Employee emp) {
		System.out.println("Saving the employee:" + emp);
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("Deleting the employee:" + emp);
	}

}
