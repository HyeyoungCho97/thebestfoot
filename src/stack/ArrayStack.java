package stack;

public class ArrayStack {

	private int top;
	private int maxSize;
	private Object[] stackArray;
	
	//배열 스택 생성, 스택의 최대 크기로 생성
	public ArrayStack(int maxSize) {
		
		this.maxSize = maxSize;
		this.stackArray = new Object[maxSize];
		this.top = -1;
	}
	
	//스택에 item 입력
	public void push(Object item) {
		
		if(top==maxSize-1) throw new ArrayIndexOutOfBoundsException((top+1)+">=" + maxSize);
        
        stackArray[++top] = item;
        System.out.println(top);
	}
	
	//스택의 가장 위의 데이터 반환
	public Object peek() {
		
		if(top==-1) throw new ArrayIndexOutOfBoundsException((top+1)+">=" + maxSize);
        
        return stackArray[top];
	}
	
	
	public Object pop() {
		
		Object item = peek();
		
		top--;
		
		return item;
	}
}

