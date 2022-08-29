package com.Ritesh;

import java.util.HashMap;
import java.util.Map;

//given an array of integers return indices of the two numbers such that they adds up and add up to the specific target.

//Given an array of integer {2,11,5,10,7,8} target =9

//since, array[0]+array[4]=2+7=9 return {0,4}


public class TwoSum {
	
	
	public int[] sumtarget(int [] arr,int target) {
		
		int [] res = new int[2];
		
		Map<Integer,Integer> map =new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(target-arr[i])) {
				map.put(arr[i], i);
			}else {
				res[1]=i;
				res[0]= map.get(target-arr[i]);
				return res;
			}
		}
		throw new IllegalArgumentException("Two numbers not found");
	}
	
	public void printArray(int [] arr) {
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TwoSum ts =new TwoSum();
		
		int[] arr = new int[] {34,67,89,90,67,23,57,90};
		
		int[] res = ts.sumtarget(arr, 147);
		
		ts.printArray(res);
		
	}
}
