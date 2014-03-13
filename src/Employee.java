
public abstract class Employee extends CompanyPerson {

	protected String department;
	protected int payrate;
	
	public Employee(String name, int id, String dept, int payrate) {
		super(name, id);
		this.department = dept;
		this.payrate = payrate;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getPayRate() {
		return payrate;
	}
	
	public void setPayRate(int payrate) {
		this.payrate = payrate;
	}
	
	public abstract int getWeeklyWage();
}
