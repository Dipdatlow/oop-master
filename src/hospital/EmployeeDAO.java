package hospital;

public class EmployeeDAO {
	
	DatabaseConnectionManager connectionManager;

	public EmployeeDAO(DatabaseConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}
	
	
	public void saveEmployee(Employee emp) {
		System.out.println("Saving the employee:" + emp.name);
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("Deleting the employee:" + emp.name);
	}

}
