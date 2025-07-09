package com.stringmethod;

public class LowerToUpperCase {
	public static void main(String[] args) {
		String s = "Ritesh";
		String res = " ";
		for(int i=0;i<s.length();i++)
		{
			char c  = s.charAt(i);
			if(c>='a' && c<='z')
			{
				int x = (int) c;
				x = x-32;
				c = (char)x;
				res = res +c;
			}
			else
			{
				res = res + c;
			}
		}
		System.out.println(res);
	}
}
