package com.home.stack;

public class linkedlistStack {
	
	
	Node head;
	
	linkedlistStack(){
		head=null;
		
	}
	
	
	
	public void push(int val){
       Node newNode=new Node();
       newNode.value=val;
       newNode.nextNode =head;
		
	}

}
