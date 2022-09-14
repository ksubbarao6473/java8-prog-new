package info.ds.interview.prog;

public class PalindromeNumber {
	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
		int x=121;
		System.out.println(x+" palindrome condition is "+pn.palindorm(x));
	}
	
	public Boolean palindorm(int x) {
		if(x<0) {
			return false;
		}
		int num = x;
		int rev = 0;
		int rem = 0;
		while(x>0) {
			rem = x%10;
			rev = rev*10 + rem;
			x = x/10;
			
		}
		System.out.println("given value "+num+" reverse value is "+rev);
		if(num == rev) {
			return true;
		} 
		return false;
	}

}
