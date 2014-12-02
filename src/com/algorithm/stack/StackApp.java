package com.algorithm.stack;

public class StackApp {

	public static void main(String[] args) {

		StackX<Long> theStack = new StackX<Long>(10);
		theStack.push(20L);
		theStack.push(40L);
		theStack.push(60L);
		theStack.push(80L);
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.print(value);
			System.out.println("  ");
		}

	}

}
