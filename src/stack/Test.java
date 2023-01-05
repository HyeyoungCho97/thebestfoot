package stack;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	
	public static void main(String[] args) {
		
		/*
		ArrayStack arrayStack = new ArrayStack(5);
		
		System.out.println("Array Stack 테스트");
		
		//스택에 데이터 삽입
		for(int i=1; i<=6; i++) {
			arrayStack.push("data-"+i);
		}
		
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		*/
		/*
		LinkedListStack linkedlistStack = new LinkedListStack();
		
		System.out.println("Linst Stack 테스트");
		
		//스택에 데이터 삽입
		for(int i=1; i<=5; i++) {
			linkedlistStack.push("ListStack 데이터-"+i);
		}
		
		linkedlistStack.push("ListStack 데이터-6");
		
		System.out.println(linkedlistStack.pop());
		System.out.println(linkedlistStack.pop());
		System.out.println(linkedlistStack.peek());
		System.out.println(linkedlistStack.peek());
		System.out.println(linkedlistStack.pop());
		System.out.println(linkedlistStack.pop());
		System.out.println(linkedlistStack.pop());
		*/
		
		Stack<Integer> stk = new Stack<>();
		
		stk.push(1);
		stk.push(4);
		
		System.out.println("package Stack 테스트");
		
		System.out.println(stk.pop());
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		
		
		
	}
}
