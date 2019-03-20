package com.bridgelabz.customDataStructure;

public class QueueUsingForAnagram {

	@SuppressWarnings("rawtypes")
	Node front;
	@SuppressWarnings("rawtypes")
	Node rear;
	
	//###NOTE: in LINKED LIST ,initially
			//####NOTE : Head---always initally it is NULL only ,ONLY when the LIST is EMPTY
				//INITIALLY HEAD will point to NULL only 
						//Condition---ONLY when the LIST is EMPTY
		
		//Like the LinkedList program---the method insertAtBeginning is same---ata)
				//Here like--- InsertAtTop 
					//both method have same working ,//### REFER book for it
		
		
		//public void insertAtBeginning(int data)
		
		@SuppressWarnings("unchecked")
		public void insertAtEnd(int data)  //like
		{
			
			@SuppressWarnings("rawtypes")
			Node node=new Node();
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
				}
				else
				{   
				//here i.e rear++
					rear.next = node;  //#1 //joining the rear--pointed ele  with
												//to the new node
					     rear = node;  //#2 //then {change---rear} , point the rear to the node 
					
				    node.next = null;  //#3 //now point the new node.next to NULL
				}
		}		
		
		@SuppressWarnings({ "unused", "rawtypes" })
		public int pop()
		{
			int z=0;
			
			Node temp;
			
			if(front==null)
			{
				System.out.println("Queue underflow");
			}
			else
			{
				 z=(int) front.data;
				 
				 front=front.next;
				
			}
			return z;
		}
		

		@SuppressWarnings("rawtypes")
		public void show()
		{
			Node temp;
			
			temp= front;
			
				if(front== null)
				{
					 System.out.println("QUeue is empty");
				}
				else
				{
					System.out.println("printing the elements of Queue");
					while(temp!= null)
					{
						System.out.print(temp.data+" ");
						temp =temp.next;
					}
				}
		}	
		
}
