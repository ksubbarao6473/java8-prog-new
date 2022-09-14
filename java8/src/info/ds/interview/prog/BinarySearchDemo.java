package info.ds.interview.prog;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] arr = { 1,5,10,15,20,25,30,35,40};
		BinarySearchDemo bs = new BinarySearchDemo();
		if(bs.binarySearch(50, arr)) {
			System.out.println("element is present");
		} else {
			System.out.println("element is not present");
		}

	}
	
	public Boolean binarySearch(int num, int[] arr) {
		
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		while(low<=high) {
			mid = (low + high)/2;
			if(num == arr[mid]) {
				return true;
			}
			else if(num > arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
			
		}
		
		
		return false;
	}

}
