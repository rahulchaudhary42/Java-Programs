package com.bridgelabz.RafeWork;

public class SingleTon {
	private static SingleTon st;
	
	public static SingleTon getBean() {
		
		if(st == null) {
			 st = new SingleTon();
			return st;
		}
		return st;
	}
	private SingleTon() {	
	}
}
