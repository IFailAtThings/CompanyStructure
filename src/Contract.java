
public abstract class Contract {
	protected int payrate;
	protected int hours;
	
	public int getPayRate() {
		return payrate;
	}
	
	public void setPayRate(int payrate) {
		this.payrate = payrate;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getWeeklyWage() {
		return payrate * hours;
	}
	
	public int getYearlyWage() {
		return payrate * hours * 52;
	}
	
	public void displayWeeklyWage() {
		System.out.print("Weekly Pay: " + getWeeklyWage());
	}
	
	public void displayYearlyWage() {
		System.out.print("Yearly Pay: " + getYearlyWage());
	}
	
}
