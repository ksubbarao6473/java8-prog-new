package info.enums.interview.prog;

public class EnumMain {

	public static void main(String[] args) {
		System.out.print("days in week are ");
		for(EnumDays days: EnumDays.values()) {
			System.out.print(days+" ");
		}

	}

}
