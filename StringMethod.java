package com.stringmethod;

import java.util.Arrays;

public class StringMethod {
	public static void main(String[] args) {
		String s = "Programming";
		
		//charAt
		System.out.println(s.charAt(2)); // o
		System.out.println(s.charAt(5)); // a
//		System.out.println(s.charAt(15)); // StringIndexOutOfBoundsExpceptions
		
		//concat(String)
		s = s.concat("Language");
		System.out.println(s); // ProgrammingLanguage
		
		//contains(String str)
		System.out.println(s.contains("Pro")); //true
		System.out.println(s.contains("grm")); //false
		
		//length
		System.out.println(s.length()); //19
		
		//endsWith(String)
		System.out.println(s.endsWith("e")); //true
		System.out.println(s.endsWith("age")); //true
		System.out.println(s.endsWith("gram")); //false
		
		//startsWith(String)
		System.out.println(s.startsWith("P")); //true
		System.out.println(s.startsWith("L")); //false
		
		//equals(Object)
		System.out.println(s.equals("ProgrammingLanguage")); //true
		System.out.println(s.equals("programminglanguage")); //false
		
		//equalsIgnoreCase(String)
		System.out.println(s.equalsIgnoreCase("programminglanguage")); //true
		
		//indexOf(char,int)
		System.out.println(s.indexOf('a',6)); //12
		System.out.println(s.indexOf('z',2)); //-1
		
		//indexOf(String)
		System.out.println(s.indexOf("gram")); //3
		System.out.println(s.indexOf("Lan")); //11
		
		//indexOf(String,index)
		System.out.println(s.indexOf("gram", 2)); //3
		System.out.println(s.indexOf("Pro",3)); //-1
		
		//isEmpty()
		System.out.println(s.isEmpty()); //false
		String s1 = "";
		System.out.println(s1.isEmpty()); //true
		
		//replace
		System.out.println(s.replace('a', 'x'));
		
		//substring(int begins_index)
		System.out.println(s.substring(3)); //grammingLanguage
		
		//substring(start, end)
		System.out.println(s.substring(3,6)); //gra
		
		//toCharArray
		char [] c = s.toCharArray();
		System.out.println(Arrays.toString(c)); //[P, r, o, g, r, a, m, m, i, n, g, L, a, n, g, u, a, g, e]
		
		//tolowercase
		System.out.println(s.toLowerCase()); //programminglanguage
		
		//toUppercase
		System.out.println(s.toUpperCase()); //PROGRAMMINGLANGUAGE
		
		//trim()
		String s3 = "     wertyuihgf   ertyuiugf ghbn    ";
		System.out.println(s3.trim()); //wertyuihgf   ertyuiugf ghbn
		
		//split(String)
		String s4 = "hello How Are You?";
		String [] s5 = s4.split(" ");
		System.out.println(Arrays.toString(s5)); // [hello, How, Are, You?]
	}
}
