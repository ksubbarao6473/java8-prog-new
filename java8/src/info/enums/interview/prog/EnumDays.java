package info.enums.interview.prog;

public enum EnumDays {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	
	String data;
	
	private EnumDays() {
		System.out.println("private constructor calling");
	}
	
	EnumDays(String data) {
		System.out.println("private constructor calling");
	}

}
