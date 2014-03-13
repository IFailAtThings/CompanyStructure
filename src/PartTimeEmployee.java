
public class PartTimeEmployee extends Employee {

	private int hours;
	
	public PartTimeEmployee(String name, int id, String dept, int payrate, int hours) {
		super(name, id, dept, payrate);
		this.hours = hours;
	}
	
	public int getWeeklyWage() {
		return payrate * hours;
	}
	
	public void display() {
		super.display();
		System.out.println("Department: " + department);
		System.out.println("Payrate: " + payrate);
		System.out.println("Hours " + hours);
	}
	
}
