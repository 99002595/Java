package sample;

public class employee {
	private String name;
	private String city;
	private Double salary;
	
	
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public employee(String name, String city, Double salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
	
	

}
