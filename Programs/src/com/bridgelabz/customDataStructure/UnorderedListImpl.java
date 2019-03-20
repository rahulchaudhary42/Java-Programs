package com.bridgelabz.customDataStructure;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class UnorderedListImpl<T> implements ListUnordered<T> 
{
	private Node<T> first;
	private Node<T> last;
	private int size;


		@Override
		public void add(T ele) 
		{
			Node<T> n = new Node<T>(ele);
		
			if((first == null ) &&(last == null))
			{
				first = last = n;
		
			}
			else
			{
				last.next=n;
				last = n;
			}
			size++;
		}
		@Override
		public void print() 
		{
			System.out.println("Printing the contents :");
			Node<T> temp = first;
			while(temp!=null)
			{
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println("");
		}
		@Override
		public boolean contains(T ele) 
		{
			Node<T> temp = first;
			while(temp!= null)
			{
				if(temp.data.equals(ele))
					return true;
		
				temp = temp.next;
		
			}
			return false;
		}

		@Override
		public boolean remove(T ele)
		{
			Node<T> temp = first,prev=null;
			while(first!= null)
			{
				if(temp.data.equals(ele))
				{
					if(prev == null)
					{
						first = temp.next;
		
					}
					else
					{
						prev.next = temp.next;
						temp.next = null;
					}
					size--;
					return true;
				}
				else
				{
					prev = temp;
					temp = temp.next;
				}
			}
			return false;
		}

		@Override
		public int size() 
		{
			return size;
		}
		
		@Override
		public boolean isEmpty()
		{
			return (size==0);
		}

		@Override
		public void append(T item) 
		{
			if(isEmpty())
			{
				first = new Node<T>(item);
			}
			else if (contains(item))
				System.out.println("item "+item+" already exist in the list");
		
			else
			{
				Node<T> newNode = new Node<T>(item);
				last.setNext(newNode);
				last = newNode;
			}
		}

		@Override
		public void insert(int pos, T item) 
		{
			Node<T>	prev = first;
			Node<T> curr = first;
			Node<T> newNode = new Node<>(item);
		
			int  count = -1;
			while(curr != null)
			{
				count++;
				if(count == pos && count == 0)// insertion at 0th position, update first
				{
					newNode.setNext(curr);
					first = newNode;
					break;
				}
				else if(count == pos)
				{
					newNode.setNext(curr);
					prev.setNext(newNode);
					break;
				}
				prev = curr;
				curr = curr.getNext();
			}
			if(curr == null && pos == count+1)
				if(curr == null && pos == count +1)//insertion after the last, update last
				{
					prev.setNext(newNode);
					last = newNode;
				}
				else 
					System.out.println("Given position is not found in the lsit...!");
		}

		//remove and return the last item in the list
		public T pop() 
		{
			if(isEmpty())
			{
				System.out.println("List is empty...!");
				return null;
			}
			if(first == last) {//remove the only item in the list
				first = last = null;
				return first.getData();
			}
			Node<T> curr = first;
			Node<T> prev = first;
			while(curr.getNext() != null) {//traverse to reach the last item in the list
				prev = curr;
				curr = curr.getNext();
			}
			//remove the curr item which is the last item in the list
			last = prev;
			last.setNext(null);
			return curr.getData();
		}
		
		public T pop(int pos)
		{
			if(isEmpty())
			{
				System.out.println("List is empty...!");
				return null;
			}
			Node<T> curr = first;
			Node<T> prev = first;
		
			int  count = -1;
			while(curr != null) 
			{
				//traverse to reach the last item in the list
				count++;
				if(count == pos && count == 0)
				{
					first = curr.getNext();
					curr.setNext(null);
					return curr.getData();
				}
				else if(count == pos && curr == last) 
				{
					// removal at the last position
					last = prev;
					last.setNext(null);
					return curr.getData();
				}
				else if(count == pos)
				{
					//removal in-between
					prev.setNext(curr.getNext());
					curr.setNext(null);
					return curr.getData();
				}
				prev = curr;
				curr = curr.getNext();
			}
			System.out.println("Given position is not found in the lsit...!");
			return null;
		}

		@Override
		public void writeToFile(UnorderedListImpl<T> list, String filePath) 
		{
			if(list == null)
				return;
		
			Node<T> curr = first;
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,false)))
			{
				while(curr != null) 
				{
					bw.write(curr.getData().toString()+",");
					curr = curr.getNext();
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}

		@Override
		public int index(T item) 
		{
			if(isEmpty())
			{
				System.out.println("List is empty...!");
				return -1;//error case
			}
			Node<T> curr = first;
			int  count = -1;
			while(curr != null) 
			{
				count++;
				if(curr.getData() == item)
		            return  count;
			}
			System.out.println(item + "not found in the list...!");
			return -1;
		}
}


