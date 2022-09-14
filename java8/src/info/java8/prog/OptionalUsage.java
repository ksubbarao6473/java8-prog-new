package info.java8.prog;

import java.util.Optional;

public class OptionalUsage {

	public static void main(String[] args) {
		//Optional<String> str = Opt
		String[] str = new String[5];
		str[3] = "subbu";
		//System.out.println(str[3].contains("a"));
		Optional<String> check = Optional.ofNullable(str[3]);
		if(check.isPresent()) {
			System.out.println("string value:"+str[3]);
		}
		if(check.isEmpty()) {
			System.out.println("empty value:");
		}

	}

}
