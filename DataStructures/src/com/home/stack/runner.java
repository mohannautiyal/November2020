package com.home.stack;

public class runner {

	public static void main(String[] args) {

		stackImp stack= new stackImp(5);
		stack.pop();
		//System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(40);
		stack.push(30);
		stack.push(60);
		//stack.push(30);

		System.out.println(stack.isFull());
        stack.display();
        System.out.println("===========================");
        stack.pop();
        System.out.println("===========================");
        stack.peek();
        System.out.println("===========================");
        stack.push(90);
        stack.pop();
        stack.pop();
        stack.display();
	}

}
