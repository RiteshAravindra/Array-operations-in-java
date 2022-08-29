package com.Ritesh;

public class ArrayUtil {
	
	public void printArray(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//How to find minimum value in array
	public int findMinimum(int [] arr) {
		
		if(arr== null || arr.length==0) {
			throw new IllegalArgumentException("Invalid input");
		}
		int min =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public void arratDemo() {
		int [] arrRitesh =new int[5];
		int [] emptyarr=new int[0];
		
		arrRitesh[0]=82;
		arrRitesh[1]=87;
		arrRitesh[2]=38;
		arrRitesh[3]=88;
		arrRitesh[4]=98;
		printArray(arrRitesh);
		int minimum = findMinimum(arrRitesh);
		System.out.println("minimum num in array"+ minimum);
		int minimum1 = findMinimum(emptyarr);
		System.out.println("minimum num in array"+ minimum1);
		System.out.println(arrRitesh.length);
		
		System.out.println(arrRitesh[arrRitesh.length-1]);
		
		
		
	}
	
	public static void main(String[] args) {
		ArrayUtil arrUtil = new ArrayUtil();
		
		arrUtil.arratDemo();
	
		
	}

}

