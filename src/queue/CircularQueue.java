package queue;

import java.util.Scanner;

public class CircularQueue {

	private int front;
	private int rear;
	private Object[] cQueue;
	
	private int maxSize;
	
	//배열 큐 생성, 큐의 최대크기로 생성
	public CircularQueue(int maxSize) {
		
		this.maxSize = maxSize+1;
		this.cQueue = new Object[this.maxSize];
		this.front = 0;
		this.rear = 0;
		
	}
	
	//큐에 데이터 삽입
	public void Enqueue(Object item) {
		
		if(++rear%maxSize==this.front) throw new ArrayIndexOutOfBoundsException();
		
		cQueue[rear%maxSize] = item;
		
	}
	
	//큐의 데이터 확인
	public Object peek() {
		
		if(front==rear) throw new ArrayIndexOutOfBoundsException();
		
		return cQueue[((front+1)%maxSize)];
	}
	

	//큐에 데이터 삭제
	public Object Dequeue() {
		
		Object item = peek();
		
		front = ++front%maxSize;
		
		
		return item;
		
	}
	
}
