package company;


public class Manager extends CompanyPerson {

	public Manager(String name, int id) {
		super(name, id);
	}

	public Employee[] employees;
	private int numEmployees = 0;

	public Employee[] getEmployees() {
		return employees;
	}

	public void addEmployee(Employee thisemployee){
		employees[numEmployees] = thisemployee;
		numEmployees ++;
	}

	public void removeEmployee(int id){
		for(int i = 0; i < numEmployees; i ++){
			if(employees[i].getId() == id){
				for(int j = i; j < numEmployees; j ++){
					employees[j] = employees[j+1];
				}
				numEmployees--;
			}
		}
	}
}
