package com.stringmethod;

public class FrequencyOfCharacter {
	public static void main(String[] args) {
		String s = "abbcdefec";
		Frequency(s);
	}
	public static void Frequency(String s)
	{
		char[] c = s.toCharArray();
		int[] freq = new int[c.length];
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='@')
			{
				freq[i] = 1;
				for(int j=i+1;j<c.length;j++)
				{
					if(c[j]!='@' && c[i]==c[j])
					{
						c[j] = '@';
						freq[i]++;
					}
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='@')
			{
				System.out.println(c[i]+"----->"+freq[i]);
			}
		}
	}
}
