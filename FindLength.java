package com.stringmethod;

public class FindLength {
	public static void main(String[] args) {
		String s = "Ritesh";
		int count = 0;
		while(true)
		{
			try
			{
				s.charAt(count);
				count++;
				
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(count);
				break;
			}
		}
	}
}
