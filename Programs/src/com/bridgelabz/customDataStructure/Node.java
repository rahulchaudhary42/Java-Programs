package com.bridgelabz.customDataStructure;
class Node<T> implements Comparable<T> 
   {
		protected T data;
		protected Node<T> next;
		
		public Node()  
		{
			 
		}
		public Node(T d)
		{
			this.data = d;
		}
		
		public T getData() 
		{
			return data;
		}
		public void setData(T data) 
		{
			this.data = data;
		}
		public Node<T> getNext() 
		{
			return next;
		}
		public void setNext(Node<T> next) 
		{
			this.next = next;
		}
		@Override
		public int hashCode() 
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + ((data == null) ? 0 : data.hashCode());
			result = prime * result + ((next == null) ? 0 : next.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			@SuppressWarnings("unchecked")
			Node<T> other = (Node<T>) obj;
			if (data == null) 
			{
				if (other.data != null)
					return false;
			} else if (!data.equals(other.data))
				return false;
			if (next == null)
			{
				if (other.next != null)
					return false;
			}
			else if (!next.equals(other.next))
				return false;
			return true;
		}
		@Override
		public String toString() 
		{
			return "Node [data=" + data + ", next=" + next + "]";
		}
		@SuppressWarnings("unchecked")
		public int compareTo(T element)
		{
			// TODO Auto-generated method stub
			return ((Comparable<T>) this.getData()).compareTo(element);
		}
  }
