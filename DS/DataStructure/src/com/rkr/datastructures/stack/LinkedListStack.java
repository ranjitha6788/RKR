package com.rkr.datastructures.stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStack<T> implements Iterable<T> {

	private LinkedList<T> list = new LinkedList<T>();

	// Create an empty stack
	public LinkedListStack() {
	}

	// Create a Stack with an initial element
	public LinkedListStack(T firstElem) {
		push(firstElem);
	}

	// Return the number of elements in the stack
	public int size() {
		return list.size();
	}

	// Check if the stack is empty
	public boolean isEmpty() {
		return size() == 0;
	}

	// Push
	public void push(T elem) {
		list.addLast(elem);
	}

	// Pop
	public T pop() {
		if (isEmpty())
			throw new EmptyStackException();
		return list.removeLast();
	}

	// Peek
	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return list.peekLast();
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}

	public static void main(String[] args) {
		LinkedListStack<Integer> stack = new LinkedListStack<>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(3);
		stack.push(5);
		stack.push(2);
		
		System.out.println("Stack size: "+stack.size());
		
		stack.pop();
		
		System.out.println("Stack size: "+stack.size());
		
		stack.push(10);
		stack.push(7);
		
		System.out.println("Peek: "+stack.peek());
		
		System.out.println("Stack size: "+stack.size());

	}

	
}
