package com.rkr.datastructures.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.rkr.datastructures.stack.IntArrayStack;
import com.rkr.datastructures.stack.LinkedListStack;

public class LinkedListStackTest {

	LinkedListStack<Integer> stack;
	
	@Before
	public void setUp(){
		stack = new LinkedListStack<>();
	}
	
	@Test
	public void testEmptyStack(){
		assertTrue(stack.isEmpty());
		assertEquals(stack.size(), 0);
	}
	
	@Test
	public void testPush(){
		stack.push(3);
		stack.push(5);
		stack.push(2);
		assertEquals(stack.size(), 3);
	}
	
	@Test
	public void testpop(){
		stack.push(3);
		assertTrue(stack.pop() == 3);
	    assertEquals(stack.size(), 0);
	}

}
