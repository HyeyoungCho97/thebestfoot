package queue;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
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
		
	}
}
