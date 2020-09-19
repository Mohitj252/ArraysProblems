package main.java.arraysProblems;

/**
 * find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
 * 
 * @author mohitjai
 *
 */
public class LargestSumSubArray {
	static void getLargestSumSubArray(int[] array) {
		int maxSoFar =0;
		int sum = 0;
		int start = 0;
		int end = 0;
		int startPointofSubArray = 0;
		for(int i=0; i < array.length; i++) {
			//sum is gives you the result of sum of all the elements
			sum = sum + array[i];
			//if condition is to get max count of the subarray
			if(sum > maxSoFar) {
				maxSoFar = sum;
				start = startPointofSubArray;
				end = i;
			}
			if(sum < 0) {
				sum = 0;
				startPointofSubArray = i+1;
			}
		}
		System.out.println(maxSoFar);
		while(start <= end) {
			System.out.print(array[start] +" ");
			start = start+1;
		}
	}
	public static void main(String[] args) {
		int [] array = {-2, -3, 4, -1, -2, 1, 5, -3};
		getLargestSumSubArray(array);
	}

}
