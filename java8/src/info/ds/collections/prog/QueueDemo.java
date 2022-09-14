package info.ds.collections.prog;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q  = new LinkedList<>();
		for(int i=0;i<10;i++) {
			q.add(i);
		}
		System.out.println("elements are in queue are "+q);
		// removing the first element
		q.remove();
		System.out.println("After removing first element "+q);
		
		// priority queue
		Queue<Integer> p1 = new PriorityQueue<>();
		for(int i=0;i<10;i++) {
			p1.add(i);
		}
		System.out.println("elements are in priority queue are "+p1);
		p1.remove();
		System.out.println("After removing one element in priority queue p1 are "+p1);
		
		Queue<String> p2 = new PriorityQueue<>();
		p2.add("raj");
		p2.add("suri");
		p2.add("venk");
		p2.add("avani");
		p2.add("bhagath");
		p2.add("mahi");
		
		System.out.println("elements are in priority queue are "+p2);
		p2.remove();
		System.out.println("After removing one element in priority queue p2 are "+p2);

	}

}
