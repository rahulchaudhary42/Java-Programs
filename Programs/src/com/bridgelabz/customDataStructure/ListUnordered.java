package com.bridgelabz.customDataStructure;
public interface ListUnordered<T>
{
	public void add(T ele);
	public void print();
	boolean contains(T ele);
	boolean remove(T ele);
	public int size();
	boolean isEmpty();
	void append(T item);
	void insert(int pos, T item);
	void writeToFile(UnorderedListImpl<T> list, String filePath);
	int index(T item);
	public T pop();
	public T pop(int pos);
}