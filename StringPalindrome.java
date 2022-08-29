package com.Ritesh;
//how to check the string is palindrome or not \\

//given string ="madam" ---> true
//given string ="that"  --->false

public class StringPalindrome {
	
	public boolean checkString(String word) {
		char[] charecter = word.toCharArray();
		int start = 0;
		int end =word.length()-1;
		
		while(start<end) {
			if(charecter[start]!=charecter[end]) {
				return false;
			}
			start++;
			end--;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		StringPalindrome SP= new StringPalindrome();
		
		boolean res =SP.checkString("MADAM");
		System.out.println(res);
		
	}

}
