package info.ds.ref.annotation.prog;

import java.lang.annotation.Annotation;

public class TestAnn {

	public static void main(String[] args) {
		Student s = new Student("8888","siva",8888);
		s.getStudentDetails();
		Class c = s.getClass();
		Annotation ann = c.getAnnotation(Course.class);
		Course crs = (Course)ann;
		System.out.println("*cid "+crs.cid()+" *cname "+crs.cname()+" *ccost "+crs.ccost());
	}

}
