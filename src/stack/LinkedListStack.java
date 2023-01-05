package stack;

public class LinkedListStack {

	private Node top;
	
	private class Node{
		
		private Object data;
		private Node next;
		
		Node(Object data){
			this.data = data;
			this.next = null;
		}
	}
	
	// 노드가 하나도 없으므로 초기값 설정.
	public LinkedListStack() {
		this.top = null;
	}
	
	// 리스트에 데이터 저장
	public void push(Object item) {
		
		Node newNode = new Node(item);
		newNode.next = top;
		top = newNode;
		
	}
	
	// 스택 가장 위의 값 반환
	public Object peek() {
		
		if(top==null) throw new ArrayIndexOutOfBoundsException();
		
		return top.data;
		
	}
	
	
	public Object pop(){
	
	Object item = peek();
	top = top.next;
	
	return item;
	
	}
}
