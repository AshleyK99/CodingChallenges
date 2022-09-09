package com.revature;

public class LargestGap {
	
	public static int gap(int[] arr) {
		
		int result = 0;
		for(int i = 0; i< arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int temp = Math.abs(arr[i]-arr[j]);
				if(temp > result) {
					result = temp;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		int[] arr = {4,5,9,0};
		
		System.out.println(gap(arr));
		
		int[] arr2 = {3,10,6,7};
		System.out.println(gap(arr2));
	}

}
