package info.ds.ref.prog;

public class SynchronizedSingleton {
	private static SynchronizedSingleton singelton_instance;
	private SynchronizedSingleton() {
		System.out.println("private constructor calling");
	}
	
	public synchronized static SynchronizedSingleton getInstance() {
		if(singelton_instance==null) {
			singelton_instance = new SynchronizedSingleton();
		}
		return singelton_instance;
	}

}
