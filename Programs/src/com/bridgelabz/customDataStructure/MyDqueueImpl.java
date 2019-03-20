package com.bridgelabz.customDataStructure;

import java.util.Arrays;

public class MyDqueueImpl<T> //implements  DqueueList<T>
{
	int size;	//size of the DEQUE
	Object s[];		//create object array 
	int front,rear = -1;

	public MyDqueueImpl(int size)
	{
		this.size=size;
		
		s=new Object[size];
	}



	/**
	 * dqueue follows insert from both end
	 * to add element from FRONT end 
	 * @param o
	 * @return : object
	 */
	boolean frontenqueue(Object o)
	{
		if(isempty())
		{
			System.out.println("Stack underflow");
			return false;
		}
		
		if(front-1>=0)   //as arr start index is----0 , so front should not exceed 0
		{
			s[front-1]= o;
			
			front--;     
			return true;
		}
		
	   return false;
	}
	
	/**
	 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
	 * so to remove element from the Front end 
	 * @return  :  object
	 */
	public Object frontdequeue() //remove element from front //here
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
	 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
	 * to check if the array(dqueue ) is empty
	 * @return  : boolean
	 */
	boolean isempty()
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
	 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
	 * to add element from REAR end 
	 * @param o
	 * @return : object
	 */
	
	
	/**
	 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
	 * to add element from REAR side
	 * @param o: Object passed
	 * @return : object
	 */
	public boolean rearenqueue(Object o)
	{
		if(rear==size-1)
		{
			System.out.println("Stack OVERflow");
			return false;
		}
		
		s[++rear]= o;

		   return true;
	}
	
	/**
	 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
	 * so to remove element from the Front end 
	 * @return  :  object
	 */
	Object reardequeue() //remove element from front //here
	{   
		if(rear==-1)
		{
			System.out.println("Queue is underflow ");
		} 
		
	    Object e= s[rear];
	    
	    rear--;
	    
		  return e;
	}

	/**
	 * print the DEQUEUE 
	 * @return : String
	 *  
	 */
    public String toString()
    {
		return "Myqueue [size=" + size + ", s=" + Arrays.toString(s) + ", front=" + front + ", rear=" + rear + "]";
	}
}
	