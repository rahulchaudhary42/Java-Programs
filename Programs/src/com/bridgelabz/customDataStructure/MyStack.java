package com.bridgelabz.customDataStructure;

//import com.bridgelabz.dataStructurePrograms.Constants;
//import com.bridgelabz.dataStructurePrograms.Node;
//import com.bridgelabz.dataStructurePrograms.Stack;

public class MyStack<T> implements Stack<T> 
{
	final int capacity = Constants.STACKSIZE;
	@SuppressWarnings("unused")
	private T[] elements;
	private int size;
	Node<T> top= null;

	public MyStack()
	{
		this.top=null;
	}
	@Override
	public void push(T ele) 
	{

		Node<T> n = new Node<T>(ele);
		n.next = top;
		top = n;
	}

	@Override
	public T pop()
	{
		if(top==null)
			return null;
		else
		{
			T ele = top.data;
			top = top.next;
			return ele;
		}
	}

	@Override
	public T peek()
	{
		return top.data;
	}

	@Override
	public void print()
	{
		Node<T> t = top;
		while(t!=null)
		{
			System.out.print(t.data+"->");
			t = t.next;
		}
		System.out.println("");

	}

	public int getStackCapacity()
	{
		return capacity;

	}
	@Override
	public boolean isEmpty() 
	{
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public int getsize()
	{
		// TODO Auto-generated method stub
		return size;
	}

}
// MyStack
// Node
// Stack
