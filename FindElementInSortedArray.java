package main.java.arraysProblems;


/**
 * Java program to find the element that appears only once in a sorted array
 * @author mohitjai
 *
 */
public class FindElementInSortedArray {
	static void search(int[] array, int startPoint, int endPoint) {
		while(startPoint <= endPoint) {
			int midPoint = (startPoint + endPoint)/2;
			if(startPoint == endPoint) {
				System.out.println("Element which appeared only once is " + array[startPoint]);
				return;
			}
			if(midPoint%2 == 0) {
				if(array[midPoint] == array[midPoint + 1]) {
					startPoint = midPoint +2;
				} else {
					endPoint = midPoint;
				}
			}
			if(midPoint%2 == 1) {
				if(array[midPoint] == array[midPoint - 1]) {
					startPoint = midPoint +1;
				} else {
					endPoint = midPoint-1;
				}
			}
			
		}
				
	}
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 4, 4, 5, 5, 6, 6}; 
        search(arr, 0, arr.length-1); 
	}

}
