package HashMapPractice;

public class Employee {
	
	private String nameOfEmployee;
	private int employeeId;
	private int salary;
	private String title;
	
	public Employee(String nameOfEmployee, int employeeId, int salary, String title) {
		super();
		this.nameOfEmployee = nameOfEmployee;
		this.employeeId = employeeId;
		this.salary = salary;
		this.title = title;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNameOfEmployee() {
		return nameOfEmployee;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	
	
	
	

}
