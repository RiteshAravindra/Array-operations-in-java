package com.Ritesh;
//merge two sorted arrays

//arr1 {2,3,5,10}  arr2 {4,6,11,15}


public class MergetwoSortedarray {
	
	public int [] meargearrays(int [] arr1 ,int [] arr2 ,int n ,int m) {
		int [] res = new int[n+m];
		
		int i=0;int j=0;int k=0;
		
		while (i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				res[k]=arr1[i];
				i++;
			}else {
				res[k]=arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<n) {
			res[k]=arr1[i];
			i++;k++;
		}
		
		while(j<m) {
			res[k]=arr2[j];
			j++;
			k++;
		}
		return res;
		
		
	}
	
	
	public void printarr(int []arr) {
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
	}
	public static void main(String[] args) {
		
		MergetwoSortedarray MtSa = new MergetwoSortedarray();
		
		int arr1[] = new int[] {34,43,67,90};
		int arr2[] = new int[] {14,43,77,100};
		
		int [] res = MtSa.meargearrays(arr1, arr2,arr1.length,arr2.length);
		
		MtSa.printarr(res);
		
		
		
		
		
	}

}
