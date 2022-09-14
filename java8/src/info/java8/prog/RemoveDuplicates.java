package info.java8.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,5,9);
		List<Integer> l1 = new ArrayList<Integer>();
 		Set<Integer> set = new HashSet<Integer>();
		System.out.println("After removing the duplicates");
		ls.stream().filter(n-> set.add(n)).map(s->s+" ").forEach(System.out::print);
		System.out.println("printing the size equals to one ");
		System.out.println("max "+ls.stream().max(Integer::compare).get());
		

	}

}
