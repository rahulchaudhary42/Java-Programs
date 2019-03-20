package com.bridgelabz.customDataStructure;
import java.util.Arrays;

public class MyQueue<T> 
{

	int size;

	Object s[];		//create object array 

	int front,rear = -1;
	
	public MyQueue(int size)
	{
		this.size=size;
		
		s=new Object[size];
	}
	
	public MyQueue() 
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * to check if the array(queue) is empty
	 * @return boolean
	 */
	public boolean isempty()
	{
		if(rear==-1 && front==-1)
		{
			return true;			
			//System.out.println("Queue is empty");

		}	
		else 
			return false;	
	}

	/**
	 * to add element from rear end 
	 * @param o
	 * @return : object
	 */
	public boolean enqueue(Object o)
	{
		if(rear==size-1)
		{
			System.out.println("Stack overflow");
			return false;
		}
		s[++rear]= o;
		return true;
	}
	/**
	 * so to remove element from the Front end 
	 * @return  :  object
	 */
	public Object dequeue()
	{   
		if(front==-1)
		{
			System.out.println("Queue is underflow ");
		} 

		Object e= s[front];

		front++;
		return e;
	}
	/**
	 * print the queue 
	 * @return : String
	 *  
	 */
	public String toString()
	{
		return "Myqueue [size=" + size + ", s=" + Arrays.toString(s) + ", front=" + front + ", rear=" + rear + "]";
	}

	public int size() 
	{
		// TODO Auto-generated method stub
		return size;
	}
	

}