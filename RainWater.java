package main.java.arraysProblems;

import java.util.Scanner;

/**
 * Trapping Rain Water Problem
 * 
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 * compute how much water it is able to trap after raining.
 * 
 * @author mohitjai
 *
 */
public class RainWater {

	private int rainWaterTrapping(int[] array) {
		int l = 0;
		int r = array.length - 1;
		int left_max = 0;
		int right_max = 0;
		int totalArea = 0;
		while (l < r) {
			if (array[l] < array[r]) {
				if (array[l] > left_max) {
					left_max = array[l];
				} else {
					totalArea = totalArea + (left_max - array[l]);
				}
				l++;
			} else {
				if (array[r] > right_max) {
					right_max = array[r];
				} else {
					totalArea = totalArea + (right_max - array[r]);
				}
				--r;
			}
		}
		return totalArea;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] buildingHeights = { 7, 1, 4, 0, 2, 8, 6, 3, 5 };
		RainWater rain = new RainWater();
		int totalArea = rain.rainWaterTrapping(buildingHeights);
		System.out.println("Wow we got the total area ..." + totalArea);

	}

}
