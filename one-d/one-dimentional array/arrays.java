package com.Ritesh;

public class arrays {
	
	public void printarray(int[] arr) {
		
		int n =arr.length;
		
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		
		arrays A1 =new arrays();
		
		int [] Ritesharray1 ;
		
		Ritesharray1=new int[5];
		
		Ritesharray1[0]=2;
		Ritesharray1[1]=6;
		Ritesharray1[2]=9;
		Ritesharray1[3]=9;
		Ritesharray1[4]=5;
		Ritesharray1[2]=78;//will update the position 2
//		Ritesharray1[5]=99;//exception :- java.lang.indexoutofboundexception;
		
		System.out.println(Ritesharray1 + " Ritesharray1");
		
		
		int[] Ritesharray = {1,4,6,7,9};
		
		A1.printarray(Ritesharray1);
		
		
		
		
		
		System.out.println("Ritesharray "+Ritesharray);
		A1.printarray(Ritesharray);
		//adding and updating elements in an array
		
		
	}

}
