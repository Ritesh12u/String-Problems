package com.stringmethod;

public class SumOfAlphaNumeric {
	public static void main(String[] args) {
		String s = "sdrtyhu2ywet3864dt3fg";
		int sum =0;
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(Character.isDigit(c))
			{
				temp = temp+c;
			}
			else
			{
				if(!temp.isEmpty())
				{
					sum = sum +Integer.parseInt(temp);
					temp ="";
				}
			}
		}
		if(!temp.isEmpty())
		{
			sum = sum+Integer.parseInt(temp);
		}
		System.out.println(sum);
	}
}
