package info.ds.collections.prog;

import java.util.HashMap;
import java.util.Map;

public class HashingDemo {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(5, 5);
		map.put(8, 8);
		map.put(9, 9);
		map.put(3, 3);
		map.put(1, 1);
		map.put(15, 15);
		map.put(18, 18);
		map.put(2, 2);
		map.getOrDefault(99, 99);

		for(Integer key: map.keySet()) {
			System.out.println("hashCode "+key.hashCode()+" value is "+map.get(key));
		}
		System.out.println("map object "+map);
	}

}
