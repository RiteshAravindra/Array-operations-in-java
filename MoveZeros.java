package com.Ritesh;

//Given an array of integers,write a function to move all 0's to end of it while maintaining the relative order of non-zeros elements
//Given array of integer - {0,1,0,4,12}
//Solution - {1,4,12,0,0}

public class MoveZeros {
	
	public void printArray(int [] arr) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public void array() {
		int [] arr1 = {1,0,4,0,12};
		
		
		printArray(arr1);
		
		moveZeroestoend(arr1,arr1.length);
		
		printArray(arr1);
	}
	
	public void moveZeroestoend(int []arr,int n) {
		
		int j = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}

	public static void main(String[] args) {
		
		MoveZeros MZ= new MoveZeros();
		
		MZ.array();
		
		
		
	}

}
