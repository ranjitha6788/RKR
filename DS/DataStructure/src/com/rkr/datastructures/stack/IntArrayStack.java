package com.rkr.datastructures.stack;

public class IntArrayStack {
	
	private int arr[];
	private int position;
	
	public IntArrayStack(int maxSize) {
		arr = new int[maxSize];
	}
	
	public int size(){
		return position;
	}
	
	public boolean isEmpty(){
		return position == 0;
	}
	
	public int peek(){
		return arr[position - 1];
	}
	
	public void push(int arrElement){
		arr[position++] = arrElement;
	}
	
	public int pop(){
		return arr[--position];
	}
	
	public static void main(String[] args) { //type main, ctrl+space
		
		IntArrayStack stack = new IntArrayStack(5);
		
		System.out.println(stack.isEmpty());
		
		stack.push(3);
		stack.push(5);
		stack.push(2);
		
		System.out.println("Stack size: "+stack.size());
		
		System.out.println("Pop 2 elements: "+stack.pop()+"  "+stack.pop());
		
		System.out.println("Stack size: "+stack.size());
		
		stack.push(10);
		stack.push(7);
		
		System.out.println("Peek: "+stack.peek());
		
		System.out.println("Stack size: "+stack.size());
		
	}
}
