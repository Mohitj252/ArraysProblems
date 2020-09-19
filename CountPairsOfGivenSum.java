package main.java.arraysProblems;

import java.util.HashMap;


/**
 * Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.
 * @author mohitjai
 *
 */
public class CountPairsOfGivenSum {
	
	static int findSumPairs(int[] array, int targetSum) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int value: array) {
			if(!hashMap.containsKey(value)) {
				hashMap.put(value, 1);
			} else {
				hashMap.put(value, hashMap.get(value)+1);
			}
		}
		
		int doubleCountOfPairs = 0;
		for(int value : array) {
			if(hashMap.containsKey(targetSum - value)) {
				doubleCountOfPairs += hashMap.get(targetSum - value);
			}
			 // if (arr[i], arr[i]) pair satisfies the condition, 
            // then we need to ensure that the count is 
            // decreased by one such that the (arr[i], arr[i]) 
            // pair is not considered 
			if((targetSum-value) == value) {
				doubleCountOfPairs -= 1;
			}
		}
		return doubleCountOfPairs/2;
		
	}
	public static void main(String[] args) {
		int [] array = {1,8,5,6,2,5,4,9,9};
		int targetSum = 10;
		int pairCount = findSumPairs(array, targetSum);
		System.out.println("No of Pairs..." + pairCount);
	}
}
