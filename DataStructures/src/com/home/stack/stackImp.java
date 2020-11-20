package com.home.stack;

public class stackImp {

	
	// Time complexity is O(1)
	int size;
	int top;
	int arr[];
	
	public stackImp(int size) {
		this.size= size;
		arr = new int[size];
		this.top=-1;
	}
	
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	
	
	public boolean isFull() {
		if(top==(size-1))
			return true;
		else
			return false;
			
	}
	
	
	// PUSH
	public void push(int item) {
		if(!isFull()) {
			top++;
			arr[top]=item;
		}
		else
			System.out.println("Sorry Stack is full");
	}
	
	// PEEK
	public void peek() {
		if(!isEmpty())
			System.out.println(arr[top]);
	}
	
	public void display() {
		for(int n:arr)
			System.out.println(n);
	}
	
	
	// POP
	public void pop() {
		if(!isEmpty()) {
			System.out.println(arr[top]);
			arr[top]=0;
			top--;
		}
		else 
			System.out.println(" Stack is empty");
	}
	
	
}
