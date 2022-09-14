package info.java8.prog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PrintEvenAndOddNumber {

	public static void main(String[] args) {
		Integer[] ar = {0,1,2,3,4,5,6,7,8,9,10,11,12,5,10};
		List<Integer> ls = Arrays.asList(ar);
		// print even numbers
		System.out.println("printing even numbers");
		ls.stream().filter(x -> x%2==0).forEach(System.out::print);
		// print odd numbers
		System.out.println("printing odd numbers");
		ls.stream().filter(x -> x%2!=0).forEach(System.out::print);
		// printing total number
		System.out.println("printing distinct numbers");
		ls.stream().distinct().forEach(System.out::print);
		
		System.out.println("printing even include spaces");
		ls.stream().filter(x -> x%2==0).forEach(x->System.out.print(" "+x));
		
		System.out.println("printing numbers with ascending order");
		ls.stream().sorted().forEach(x->System.out.print(" "+x));
		
		System.out.println("printing numbers with descending order");
		ls.stream().sorted(Collections.reverseOrder()).forEach(x->System.out.print(" "+x));
		
		//Optional<String> st;
		
	}

}
