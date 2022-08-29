package com.Ritesh;

import java.util.Arrays;

//Given an  array of integer ,return the pair of numbers such that they add up to a specific target .

//Given an array {2,11,5,10,7,8} , target = 9 ;

//Solution arr[0] + arr[4] => 2,7=9 => return {2,7}

public class TwoSumII {
	
	
	public int[] twosumreturn(int [] arr1 ,int target) {
		
		
		Arrays.sort(arr1);
		int [] res =new int [2];
		
		int left=0;
		int right=arr1.length-1;
		
		while(left< right) {
			int sum= arr1[left]+arr1[right];
			
			if(sum==target) {
				res[0]=arr1[left];
				res[1]=arr1[right];
				return res;
			}else if(sum>target) {
				right--;
				
			}else {
				left++;
			}
			
			
		}
		throw new IllegalArgumentException("Two numbers not found");
	}
	
	public void printArray(int [] arr) {
		int n= arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		TwoSumII tw2 = new TwoSumII();
		
		int arr1 [] = { 23,56,78,46,78,89,34};
		
		int [] res = tw2.twosumreturn(arr1,57);
		
		tw2.printArray(res);
		
		
		

	}

}
