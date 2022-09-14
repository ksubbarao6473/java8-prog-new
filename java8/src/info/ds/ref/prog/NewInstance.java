package info.ds.ref.prog;

public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c = Class.forName("info.ds.ref.prog.A");
		A a = (A)c.newInstance();
		

	}

}

class A{
	A(int i){
		System.out.println("constructor arg calling");
	}
	
/*
 * A(){ System.out.println("no constructor arg calling"); } 
 */
}
