package com.stringmethod;

public class CountDigitInString {
	public static void main(String[] args) {
		int count =0;
		String s = "egc2123newjbd23";
		for(char c : s.toCharArray())
		{
			if(c>='0' && c<='9')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
