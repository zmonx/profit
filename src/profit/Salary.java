package profit;
public class Salary {
	
	public double salary;
	public double commission;
	public double bonus;
	
	
	public Salary(double sarary) {
		this.salary = sarary;
		this.bonus=0;
	}



	public double getSarary() {
		return salary;
	}


	public void setBonus() {
		this.bonus += 3000;
	}

	public void setSarary(double sarary) {
		this.salary = sarary;
	}



	public double getCommission() {
		return commission;
	}



	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	
	
	
	
	
}
