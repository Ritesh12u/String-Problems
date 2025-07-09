package com.stringmethod;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "abbcdefec";
		System.out.println(remove(s));
	}
	public static String remove(String s)
	{
		int count =0;
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='@')
			{
				for(int j=i+1;j<c.length;j++)
				{
					if(c[j]!='@' && c[i]==c[j])
					{
						c[j] = '@';
						count++;
					}
				}
			}
		}
		char[] res = new char[c.length-count];
		int k =0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='@')
			{
				res[k++] = c[i];
			}
		}
		return new String(res);
	}
}
