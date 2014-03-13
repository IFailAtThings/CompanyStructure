
public class PartTimeEmployee extends Employee {

	public PartTimeEmployee(String name, int id, String dept, int payrate, int hours) {
		super(name, id, dept);
	}
	
	
	public void display() {
		super.display();
		System.out.println("Department: " + department);
	}
	
}
