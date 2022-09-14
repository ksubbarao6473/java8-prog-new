package info.java8.prog;

public class Employee {
	
	private int empId;
	private String name;
	private long sal;
		
	public Employee(int empId, String name, long sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	
	

}
