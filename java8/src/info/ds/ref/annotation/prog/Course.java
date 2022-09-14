package info.ds.ref.annotation.prog;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
 @interface Course {
	
	String cid () default "1111";
	String cname () default "java";
	int ccost () default 25000 ;
 
}
