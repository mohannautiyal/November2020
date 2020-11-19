package com.home.stack;

public class stackImp {

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
	
	
	
	public void add(int item) {
		if(!isFull()) {
			top++;
			arr[top]=item;
		}
		else
			System.out.println("Sorry Stack is full");
	}
	
	
	
	public void display() {
		for(int n:arr)
			System.out.println(n);
	}
}
