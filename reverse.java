package com.stringmethod;

public class reverse {
	public static void main(String[] args) {
		String s = "Ritesh";
		String res ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res = res + s.charAt(i);
		}
		System.out.println(res);
		
		System.out.println("--------------");
		
		char[] c = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		while(start<end)
		{
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
		System.out.println(c);
	}
}
