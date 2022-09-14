package info.java8.prog;

@FunctionalInterface
public interface LambdaInterfaceDemo {
	
	public void sayHello();
	
	default void m1() {
		System.out.println("entered m1() default in LambdaInterfaceDemo");
	}
	
	static void m2() {
		System.out.println("entered m2() static in LambdaInterfaceDemo");
	}
	

}
