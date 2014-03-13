
public abstract class Employee extends CompanyPerson {

	protected String department;
	
	public Employee(String name, int id, String dept) {
		super(name, id);
		this.department = dept;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
}
