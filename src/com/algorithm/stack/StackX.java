package com.algorithm.stack;

public class StackX<T> {
	private int maxSize;
	private T[] stackArray;
	private int top;
	
	@SuppressWarnings("unchecked")
	public StackX(int s) {
		this.maxSize = s;
		this.stackArray = (T[]) new Object[maxSize];
		this.top = -1;
	}
	
	public void push(T i) {
		stackArray[++top] = i;
	}
	
	public T pop() {
		return stackArray[top--];
	}
	
	public T peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}

}
