package com.bridgelabz.dataStructurePrograms;

class NodeObject 
{
	Object data ;
	NodeObject next;

	public NodeObject()
	{
		this.data= 0;
		this.next= null;
	}
}

	
	public class QueueUsingLinkedListObjecttype 
	{
		NodeObject front;
		NodeObject rear;
		
	   int size=0; 
		
 
			
			
			//public void insertAtBeginning(int data)
			
			public void insertAtEnd(Object data)  //like
			{
				
				NodeObject node=new NodeObject();
				node.data = data;
				node.next = null;
				
					//if the LIST is empty  then insert node---when List is empty
					if(front==null)
					{
						 front=node;
						 rear =node;
						 
						 node.next= null;	/*same as---another way
						 						front.next= null;
						 					     rear.next= null;
						 					*/
					
						 size++;
					}
					else
					{   
					//here i.e rear++
						rear.next = node;   //joining the rear--pointed ele  with
													//to the new node
						     rear = node;   //then {change---rear} , point the rear to the node 
						
					    node.next = null;   //now point the new node.next to NULL
					
					    size++;
					}
			}		
			
			public Object pop()
			{
				Object z=0;
				
				if(front==null)
				{
					System.out.println("Queue underflow");
				}
				else
				{
					    z =front.data;
					 
					 front=front.next;
					
				}
				return z;
			}
			
			public int size()
			{
				return size;
			}
			
			public void show()
			{
				NodeObject temp;
				
				temp= front;
				
					if(front== null)
					{
						 System.out.println("QUeue is empty");
					}
					else
					{
						System.out.println("printitng the elements of Queue");
						while(temp!= null)
						{
							System.out.println(temp.data+" ");
							temp =temp.next;
						}
					}
			}	
	}

