package info.ds.ref.prog;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import info.enums.interview.prog.EnumDays;


public class SingletonUtil {
	@Override
	public String toString() {
		return "";
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton sg1 = Singleton.getInstance();
		System.out.println("first object hashcode " + sg1.hashCode());
		Singleton sg2 = Singleton.getInstance();
		System.out.println("second object hashcode " + sg2.hashCode());
		Singleton sg3 = Singleton.getInstance();
		System.out.println("third object hashcode " + sg3.hashCode());

		SynchronizedSingleton sy1 = SynchronizedSingleton.getInstance();
		System.out.println("synchronizing first object hashcode " + sy1.hashCode());
		SynchronizedSingleton sy2 = SynchronizedSingleton.getInstance();
		System.out.println("synchronizing second object hashcode " + sy2.hashCode());
		SynchronizedSingleton sy3 = SynchronizedSingleton.getInstance();
		System.out.println("synchronizing third object hashcode " + sy3.hashCode());

		// 2nd way of creating object
		Class sg4 = Class.forName("info.ds.ref.prog.Singleton");
		if (sg4 == null) {
			System.out.println("sg4 is null");
		} else {
			System.out.println("sg4 is not null");
		}
		// 3rd way of creating object
		Class sg5 = EnumDays.class;
		System.out.println("sg5 " + sg5.hashCode());
		// by using reflection api to break the singleton class
		Constructor[] constructors = EnumDays.class.getDeclaredConstructors();
		EnumDays sg6 = null;
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			sg6 = (EnumDays) constructor.newInstance();
			break;
		}
		System.out.println("instance1.hashCode():- " + sg1.hashCode());
		System.out.println("instance2.hashCode():- " + sg6.hashCode());
		
		Class AB = Class.forName("info.ds.ref.prog.Singleton");
		AB.newInstance();
		//System.out.println("instance2.hashCode():- " + AB.hashCode());
	}

}
