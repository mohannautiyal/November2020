package com.home.stack;

public class runner {

	public static void main(String[] args) {

		stackImp stack= new stackImp(5);
		System.out.println(stack.isEmpty());
		stack.add(10);
		stack.add(20);
		stack.add(40);
		stack.add(30);
		stack.add(30);
		stack.add(30);

		System.out.println(stack.isEmpty());
        stack.display();
	}

}
