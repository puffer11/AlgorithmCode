package com.algorithm.string;

public class ReplaceEmpty {

	public static String replaceEmpty(String string, String s) {
		if(null == string || null == s)
			return string;

		StringBuffer stringBuffer = new StringBuffer();
		int length = string.length();
		for(int i=0;i<length;i++) {
			if(string.charAt(i) != ' ') {
				stringBuffer.append(string.charAt(i) );
			} else {
				stringBuffer.append(s);
			}
		}
		return stringBuffer.toString();
	}
	
	
	public static void  main(String args[]) {
		String string = "we have a country!";
		System.out.println(replaceEmpty(string, "%20"));
	}
}
