package com.bridgelabz.customDataStructure;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class OrderedList <T> implements List<T> 
{
	private Node<T> first;
	private Node<T> last;
	private int size;
	/*   
	 *create Node object with ele as data
	 *check if the LL has no first/last / size = 0
	 * if size = 0, first = last = n
	 *else, last.next = n
	 */
	@Override
	public void add(T ele)
	{
		Node<T> n = new Node<T>();
		n.setData(ele);
		n.setNext(null);
		if((first ==null) &&(last==null))
		{
			first = last = n;
			return;
		}
		if(!contains(ele)) 
		{
			//Node<T> Node = new Node<T>();
			Node<T> temp = first;
			Node<T> prev = null;
			while(temp != null && temp.compareTo(ele)<0)
			{
				prev = temp;
				temp = temp.getNext();
			}
			if(temp != null && temp == first) 
			{
				//at first position
				n.setNext(temp);
				first = n;
			}
			else if(temp != null) 
			{
				// in-between position
				prev.setNext(n);
				n.setNext(temp);
			}
			else
			{
				//last position
				last.setNext(n);
				last = n;
			}
		}
		else 
			System.out.printf("element already exits in the list");
	}
	@Override
	public void print()
	{
		System.out.println("printing OrderedList Contents...");
		Node<T> temp = first;
		while(temp!=null)
		{
			System.out.print(temp.data +"->");
			temp = temp.next;
		}
		System.out.println("");
	}

	/*   
	 *  
	 * Node temp = first;
	 * compare temp.data with ele
	 * if eq, return true
	 * else temp = temp.next until temp = null
	 */
	@Override
	public boolean contains(T ele)
	{
		 
		Node<T> temp = first;
		while(temp!=null)
		{
			if(temp.data.equals(ele))
				return true;
			temp=temp.next;
		}
		return false;
	}

	/*  
	 *  
	 * Take two var temp=first and prev=null
	 * compare first with null
	 * if ok then compare the element with your given data
	 * if the element is found then return true
	 * else
	 * go to the next elements and traverse the data 
	 * 
	 */
	@Override
	public boolean remove(T ele)
	{
		// TODO Auto-generated method stub
		Node<T> temp = first, prev=null;

		while(temp!=null)
		{
			if(temp.data.equals(ele))
			{
				if(prev==null)

					first = temp.next;
				else
				{
					prev.next=temp.next;
					temp.next=null;

				}
				size--;
				return true;
			}
			else
			{
				prev=temp;
				temp=temp.next;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.bl.DataStructures.List#isEmpty()
	 * to check whether your elements is empty in the file or not
	 */
	@Override
	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return (size==0);
	}

	/* (non-Javadoc)
	 * @see com.bl.DataStructures.List#size()
	 * to check the current size of your elements in the file
	 */
	@Override
	public int size()
	{
		// TODO Auto-generated method stub
		return size;
	}

	public T pop(int pos)
	{
		if(isEmpty())
		{
			System.out.println("your list is empty");
			return null;
		}
		Node<T> curr = first;
		Node<T> prev = first;

		int  count = -1;
		while(curr != null) 
		{
			//traverse to reach to reach the given position
			count++;
			if(count == pos && count == 0)
			{
				first = curr.getNext();
				curr.setNext(null);
				return curr.getData();
			}
			else if(count == pos && curr == last) 
			{
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
		System.out.println("position not found in the list");
		return null;
	}

	public T pop()
	{
		if(isEmpty())
		{
			System.out.println("List is empty...!");
			return null;
		}
		if(first == last)
		{
			//remove the only item in the list
			first = last = null;
			return first.getData();
		}
		Node<T> curr = first;
		Node<T> prev = first;
		while(curr.getNext() != null) 
		{
			//traverse to reach the last item in the list
			prev = curr;
			curr = curr.getNext();
		}
		//remove the curr item which is the last item in the list
		last = prev;
		last.setNext(null);
		return curr.getData();
	}


	public int index(T ele)
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			return -1;
		}
		Node<T> curr = first;
		int  count = -1;
		while(curr != null) 
		{
			count++;
			if(curr.getData() == ele)
				return  count;
		}
		System.out.println(ele + "not found in the list");
		return -1;
	}
	
	public void writeToFile(OrderedList<T> list, String filePath)
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
		} catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
	}

