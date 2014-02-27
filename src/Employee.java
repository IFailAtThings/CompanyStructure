
public class Employee {

	private String name;
	private int id;
	private String email;
	private int holidayDays;
	
	public Employee(String name, int id, String email, int holidayDays) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.holidayDays = holidayDays;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getHolidayDays() {
		return holidayDays;
	}
	
	public void setHolidayDays(int holidayDays) {
		this.holidayDays = holidayDays;
	}
	
	public void printEmployeeInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Holiday Days: " + holidayDays);
	}
	
}
