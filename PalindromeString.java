package com.stringmethod;

public class PalindromeString {
	public static void main(String[] args) {
		String s = "madam";
		String res ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res = res + s.charAt(i);
		}
		if(res.equalsIgnoreCase(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
