package info.java8.prog;

import java.util.Arrays;

public class SampleMain {
	private String name="subba";
	private static String address = "hyd";

	public static void main(String[] args) {
		SampleMain sm = new SampleMain();
		System.out.println("name is "+sm.name);
		System.out.println("address is "+address);
		System.out.println("calling to non static method");
		sm.nonstatic();
		int x = 12/10;
		float y = 12/10f;
		System.out.println("divided value "+x+" float value "+y);
		String str = "gizfdfri";
		//System.out.println(count(str));
		char[] ch = str.toCharArray();
		Arrays.asList(ch).stream().forEach(i -> {
		System.out.println(i.length);
		System.out.println("***");
		});
		Arrays.asList(str.split("")).stream().forEach(i -> {
			System.out.println(i);
			System.out.println("***");
			});
		
		Arrays.asList("subba","raj","mahesh").stream().forEach(a -> {
			System.out.println(a);
			System.out.println("***");
		});
		String str2="convert to java array";
		String[] strArray = new String[] {str2};
		for(String st: strArray) {
			System.out.println("**@"+st);
		}
		//SetOfString
		
	}
	static int count(String str) {
		//String str = "gizfdfri";
		char[] stri = str.toCharArray();
		char ch = 1;
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(i==0) {
				 ch = stri[i];
			}
			if(i>0) {
				StringBuffer sb = new StringBuffer();
				if(ch == stri[i]) {
					sb.append(stri[i]);
					count++;
				}
			}
		}
		return count;
	}
	
	public void nonstatic() {
		System.out.println("name is "+name);
		System.out.println("address is "+address);
	}

}
