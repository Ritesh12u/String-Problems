package com.stringmethod;

public class FIndLargestPalindrome {
    public static String reverseString(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString();
    }
    public static boolean checkPalindrome(String s) {
        String rev = reverseString(s);
        return rev.equalsIgnoreCase(s);
    }
    public static String largestPalindrome(String s) {
        String largestpalindrome = "";
        String[] Split = s.split(" ");
        for (String x : Split) {
            if (checkPalindrome(x)) {
                if (x.length() > largestpalindrome.length()) {
                    largestpalindrome = x;
                }
            }
        }
        return largestpalindrome;
    }
    public static void main(String[] args) {
		String s = "wow this madam knows malayalam";
		System.out.println(largestPalindrome(s));
	}
}
