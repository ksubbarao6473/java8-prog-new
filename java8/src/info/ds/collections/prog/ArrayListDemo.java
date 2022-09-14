package info.ds.collections.prog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(0, 10);
		al.add(0, 20);
		al.add(0, 30);
		al.add(0, 40);
		al.add(0, 50);
		al.add(1, 60);
		System.out.println("al data "+al);
		System.out.println("al size "+al.size());
		//System.out.println("al get(1) "+al.get(1));
		for(int i=0; i<al.size(); i++) {
			System.out.println("al for loop "+al.get(i));
		}
	}

}
