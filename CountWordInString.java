package com.stringmethod;

public class CountWordInString {
	public static void main(String[] args) {
		String s  = "The brown fox jump over the fence";
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			if((i==0 && s.charAt(i)!=' ')||(s.charAt(i-1)==' '&&s.charAt(i)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
