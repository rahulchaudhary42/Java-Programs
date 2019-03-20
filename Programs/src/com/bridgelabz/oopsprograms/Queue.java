package com.bridgelabz.oopsprograms;
 



public class Queue<E> implements QList<E> {


	private Node<E> start = null;
	private Node<E> end = null;
	private int size = 0;

	private class Node<V> {
		private V element;
		private Node<V> next;
	}

	public Queue() {
		
	}

	
	@Override
	public void enqueue(E element) {
		// TODO Auto-generated method stub
		if (end == null) {
			Node<E> temp = new Node<E>();
			temp.element = element;
			start = end = temp;
			size++;
			return;
		}
		end.next = new Node<E>();
		end = end.next;
		end.element = element;
		size++;
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if (start == null) {
			return null;
		}
		Node<E> temp = start;
		start = start.next;
		size--;
		return temp.element;
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size==0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}