package info.java8.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpUtil {
	
	public static List<Employee> getEmpList(){
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1,"subbu", 90000));
		al.add(new Employee(4,"raj", 40000));
		al.add(new Employee(2,"krish", 80000));
		al.add(new Employee(3,"naresh", 20000));
		return al;
	}
	
	public static Map<String, Employee> getMapEmpList(){
		Map<String, Employee> al = new HashMap<String, Employee>();
		al.put("Subbu", new Employee(1,"subbu", 90000));
		al.put("Raj",new Employee(4,"raj", 40000));
		al.put("Krish",new Employee(2,"krish", 80000));
		al.put("Naresh",new Employee(3,"naresh", 20000));
		return al;
	}

}
