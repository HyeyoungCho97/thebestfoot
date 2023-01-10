package queue;

import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;


public class main {
	
	public static void main(String[] args) {
		/*
		CircularQueue cqueue = new CircularQueue(5);
		
		System.out.println("Circular Queue 테스트");
		
		//큐에 데이터 삽입
		for(int i =1; i<=5; i++) {
			cqueue.Enqueue("data-"+i);
		}
		
		System.out.println(cqueue.Dequeue());
		System.out.println(cqueue.Dequeue());
		System.out.println(cqueue.Dequeue());
		
		cqueue.Enqueue("data-6");
		
		System.out.println(cqueue.Dequeue());
		System.out.println(cqueue.Dequeue());
		System.out.println(cqueue.peek());
		
		
		System.out.println(cqueue.Dequeue());
		*/
		/*
		LinkedlistQueue lqueue = new LinkedlistQueue();
		
		System.out.println("Linkedlist Queue 테스트");
		
		//큐에 데이터 삽입
		for(int i =1; i<=5; i++) {
			lqueue.Enqueue("data-"+i);
		}
		System.out.println(lqueue.Dequeue());
		System.out.println(lqueue.Dequeue());
		System.out.println(lqueue.Dequeue());
		
		lqueue.Enqueue("data-6");
		
		System.out.println(lqueue.Dequeue());
		System.out.println(lqueue.Dequeue());
		System.out.println(lqueue.peek());
		
		
		System.out.println(lqueue.Dequeue());
		*/
		
		 Queue<Integer> queue = new LinkedList<>();
		 
		 System.out.println(queue.add(1));
		 System.out.println(queue.offer(2));
		 System.out.println(queue.element());
		 System.out.println(queue.add(3));
		 System.out.println(queue.peek());
		 System.out.println(queue.toString());
		 System.out.println(queue.poll());
		 System.out.println(queue.remove());
		 System.out.println(queue.toString());
	}
}
