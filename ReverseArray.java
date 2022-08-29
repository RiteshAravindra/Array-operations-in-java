package com.Ritesh;

public class ReverseArray {
	
	public void printArray(int [] arr) {
		int n= arr.length;
		
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int[] reverseArraY(int [] arr ,int start ,int end) {
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		ReverseArray RAI = new ReverseArray();
		
		int [] reversearray = new int[] {23,56,78,99,89};
		
		RAI.printArray(reversearray);
		
		int [] reversedarray = RAI.reverseArraY(reversearray, 0, reversearray.length-1);
		
		RAI.printArray(reversedarray);
		
	}

}
