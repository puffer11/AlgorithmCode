package com.algorithm.stack;

public class ReverserString {
	private String input;
	
	public ReverserString(String in) {
		this.input = in;
	}
	
	public String doRev() {
		int stackSize = input.length();
		StackX<String> theStack = new StackX<String> (stackSize);
		for(int j = 0; j<input.length(); j++) {
			char ch = input.charAt(j);
			theStack.push(ch + "");
		}
		
		StringBuffer outBuffer = new StringBuffer();
		
		while(!theStack.isEmpty()) {
			String ch = theStack.pop();
			outBuffer.append(ch);
		}
		return outBuffer.toString();
	}
	
}
