package com.stringmethod;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "care";
		String s2 = "race";
		System.out.println(isAnagram(s1, s2));
	}
	public static String SortCharacter(String s)
	{
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		return new String(c);
	}
	public static boolean isAnagram(String s1, String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{
			String res1 = SortCharacter(s1);
			String res2 = SortCharacter(s2);
			return res1.equals(res2);
		}
	}
}
