package month1;
import java.io.*;
import java.util.Arrays;
public class ArraysClass {
	int[] arr;


	public ArraysClass(int[] arr) {
		super();
		this.arr = arr;
	}
	/*
	 * [1 2 3 4 5 6 7]
	 * target= 8
	 */
public int[] twoSum(int target) {
	for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==target-arr[i])
					return new int[]{i, j};
			}
	}
	throw new IllegalArgumentException("no solution");
}

	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,7};
		ArraysClass a= new ArraysClass(arr);
		System.out.println(Arrays.toString(a.twoSum(8)));
	}
}
