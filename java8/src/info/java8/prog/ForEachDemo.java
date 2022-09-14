package info.java8.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class ForEachDemo {

	public static void main(String[] args) {
		// list emp
		List<Employee> listEmp = EmpUtil.getEmpList();
		Employee[] empArray =  new Employee[listEmp.size()];
		//empArray = (Employee[])listEmp.toArray();
		for(int i=0;i<listEmp.size();i++) {
			empArray[i]=listEmp.get(i);
		}
		System.out.println(empArray);
		for(Employee e: empArray) {
			System.out.println("obj:"+e);
		}
		//listEmp.forEach(System.out::println);
		
		  Consumer<Employee> upperString = new Consumer<Employee>() { public void
		  accept(Employee t) { System.out.println(t.getName().toUpperCase()); } };
		  listEmp.forEach(upperString);
		  System.out.println("=========================================");
		  listEmp.stream().filter(e -> e.getSal()>20000).map(m ->
		  m.getName()).forEach(System.out::println); 
		 // listEmp.stream().forEach(x ->  x*x); 
		  System.out.println("========================================="); // map
		  //for each demo 
		  Map<String, Employee> empMap = EmpUtil.getMapEmpList();
		  empMap.forEach((k,v)->
		  System.out.println("key is "+k+" employee salary is "+v.getSal()));
		  List<Long> sal = new ArrayList<Long>();
		  /*listEmp.stream().forEach(i -> { 
		  if(!(i.getName().contentEquals("subbu"))) {
			  sal.add(i.getSal());
		  }
		  });*/
		  sal = listEmp.stream().filter(i -> !(i.getName().equals("subbu"))).map(a -> a.getSal()).collect(Collectors.toList());
		  System.out.println("sal list:"+sal);
		  Predicate<Employee> p1 = i -> i.getName().contentEquals("subbu");
		  System.out.println(listEmp.stream().filter(p1.negate()).map(a -> a.getSal()));
		
	}

}

