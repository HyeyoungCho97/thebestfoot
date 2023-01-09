package queue;

public class LinkedlistQueue {

	private Node front;
	private Node rear;
	
	private class Node{
		
		private Object data;
		private Node next;
		
		Node(Object data){
			
			this.data = data;
			this.next = null;
		}
	}
	
	//생성시 front, rear는 null을 가리킴.
	public LinkedlistQueue() {
		
		this.front = null;
		this.rear = null;
	}
	
	//큐에 데이터 삽입
	public void Enqueue(Object item) {
		
		Node newNode = new Node(item);
		newNode.next = null;
		
		if (front == null) { 
			front = newNode;
			rear = newNode;
			}
		else {
			rear.next = newNode;
			rear = newNode;
			}
			
		}

	//마지막 데이터 확인
	public Object peek() {
		
		if(front == null) throw new ArrayIndexOutOfBoundsException();
		
		return front.data;
	}
	
	public Object Dequeue() {
		
		Object item = peek();
		front = front.next;
		
		return item; 
	} 
	
}
