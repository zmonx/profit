package profit;

public class Employees {
	
	public String name;
	public String id;
	private Salary salary;
	
	public void setSalary(Salary s) {
		this.salary=s;
	}
	public Salary getSalary() {
		retuen salary;
	}
	
	public Employees(String name, String id) {
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
	
}
