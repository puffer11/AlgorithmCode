package com.algorithm.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverserApp {

	public static void main(String[] args) throws Exception {

		String input,output;
		while(true) {
			System.out.println("Enter a string");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			ReverserString theReverser = new ReverserString(input);
			output = theReverser.doRev();
			System.out.println("Reversed :" + output);
		}
	}
	
	public static String getString() throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
