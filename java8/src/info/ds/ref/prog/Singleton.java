package info.ds.ref.prog;

public class Singleton {
	private static Singleton singleton_instance=null;
	
	private Singleton() {
		System.out.println("private constructor");
	}
	
	public static Singleton getInstance() {
		if(singleton_instance==null) {
			System.out.println("object is null");
			singleton_instance= new Singleton();
		}
		return singleton_instance;
	}
	
	/*
	 * public static void main(String[] args) { Singleton sg1 =
	 * Singleton.getInstance();
	 * System.out.println("first object hashcode "+sg1.hashCode()); Singleton sg2 =
	 * Singleton.getInstance();
	 * System.out.println("second object hashcode "+sg2.hashCode()); Singleton sg3 =
	 * Singleton.getInstance();
	 * System.out.println("third object hashcode "+sg3.hashCode()); }
	 */

}
