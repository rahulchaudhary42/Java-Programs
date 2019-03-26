package com.bridgelabz.RafeWork;

public class RafeWork {

	public static void main(String[] args) {
		SingleTon st1, st2;
		st1 = SingleTon.getBean();
		st2 = SingleTon.getBean();
		
		System.out.println(st1+" "+st2);

	}

}
