package info.ds.array.prog;

import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo1 {

	public static void main(String[] args) {
		int[] ar1 = {1,4,9,3,2};
		System.out.println(Arrays.toString(ar1));
		Arrays.sort(ar1);
		System.out.println("After sorting "+Arrays.toString(ar1));
		Integer[] ar2 = {7,2,9,5,12,18,1,6};
		System.out.println("Before reverse sorting "+Arrays.toString(ar2));
		Arrays.sort(ar2, Collections.reverseOrder());
		System.out.println("After reverse sorting "+Arrays.toString(ar2));
		//Arrays.b

	}

}
