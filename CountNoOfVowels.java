package com.stringmethod;

public class CountNoOfVowels {
	public static void main(String[] args) {
		String s = "programming";
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
