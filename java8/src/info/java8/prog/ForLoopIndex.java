package info.java8.prog;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ForLoopIndex {

	public static void main(String[] args) {

		//index(10);
		List<String> list = Arrays.asList("Java", "Node", "JavaScript", "Rust", "Go");

        HashMap<Integer, String> collect = list
                .stream()
                .collect(HashMap<Integer, String>::new,
                        (map, streamValue) -> map.put(map.size(), streamValue),
                        (map, map2) -> {
                        });
        //list.stream().collect(null, null, null)
        collect.forEach((k, v) -> System.out.println(k + ":" + v));
        Supplier<LocalDate> s = () -> LocalDate.now();
        Supplier<HashMap<String,String>> s1 = () -> new HashMap<String, String>();
        //Supplier<List<String>> s2 = () -> list.forEach(s->s.);
        System.out.println("local date "+s.get());
        System.out.println("hashmap obj "+s1.get());
	}

	private static void index(int num) {
		//IntStream.range(0, num).forEach(i -> i.);
		
	}

}
