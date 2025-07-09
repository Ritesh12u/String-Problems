package com.stringmethod;

public class CountUpperAndLower {
	public static void main(String[] args) {
		int upper = 0;
		int lower = 0;
		
		String s = "ProgrAmmIng";
		for(char c : s.toCharArray())
		{
			if(c>='A' && c<='Z')
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
	}
}
