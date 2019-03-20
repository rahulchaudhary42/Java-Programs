package com.bridgelabz.customDataStructure;

public interface Stack<T> {

	public void push(T ele);
	public T pop();
	public T peek();
	public void print();
	public boolean isEmpty();
	public int getsize();
}