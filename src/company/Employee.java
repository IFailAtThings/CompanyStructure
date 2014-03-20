package company;

public class Employee extends CompanyPerson {

	private String department;
	private Contract contract;
	
	public Employee(String name, int id, String dept, Contract contract) {
		super(name, id);
		this.department = dept;
		this.contract = contract;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Contract getContract() {
		return contract;
	}
	
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	public void display() {
		//super.display();
		System.out.println("Department: " + department);
		//contract.displayHours();
		//contract.displayPayRate();
		//contract.displayWeeklyWage();
		//contract.displayYearlyWage();
	}
}
