package info.java8.prog;

public class LambdaIntImpl implements LambdaInterfaceDemo {

	public static void main(String[] args) {
		LambdaIntImpl lambdaIntImpl = new LambdaIntImpl();
		lambdaIntImpl.m1();
		lambdaIntImpl.m2();

	}

	@Override
	public void sayHello() {
		System.out.println("entered sayHello() in LambdaIntImpl");
		
	}
	//default void m1() {
		//System.out.println("entered m1() default in LambdaIntImpl");
	//}
	
	static void m2() {
		System.out.println("entered m2() static in LambdaIntImpl");
	}

}
