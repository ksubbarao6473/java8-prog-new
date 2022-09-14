package info.ds.ref.annotation.prog;

@Course(cid="5555",cname="raj",ccost=9999)
public class Student {
	String cid;
	String cname;
	int ccost;
	
	public Student(String cid, String cname, int ccost) {
		this.cid=cid;
		this.cname=cname;
		this.ccost=ccost;
	}
	
	public void getStudentDetails() {
		System.out.println("cid "+cid+" cname "+cname+" ccost "+ccost);
	}

}