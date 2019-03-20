package com.bridgelabz.oopsprograms;
public interface QList<E>
{

	public void enqueue(E element) ;
	public E dequeue();
	public boolean isEmpty();
	public int size();

}
