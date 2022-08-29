package com.Ritesh;

// How to resize an array in java

public class ResizeArray {
	
	
	
	public void printArray(int []arr) {
		int n =arr.length;
		
		for(int i=0 ;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int[] resizearr(int [] arr ,int capacity) {
		
		int [] temp = new int[capacity];
		
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
			
		}
		return temp;
	}
	public static void main (String[] args) {
		
		ResizeArray riA = new ResizeArray();
		
		int[] originalarr = new int[] {12,67,88,3,5,67};
		
		riA.printArray(originalarr);
		
		int[] modifiedarr =riA.resizearr(originalarr,90);
		
		riA.printArray(modifiedarr);
		
		
		
	}

}
