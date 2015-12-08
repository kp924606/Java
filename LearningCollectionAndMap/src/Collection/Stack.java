package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
	private Deque deque=new ArrayDeque();
	private int capacity;
	public Stack(int capacity){
		this.capacity=capacity;
	}
	public boolean push(Object o){
		if(deque.size()+1>capacity){
			return false;
		}
		return deque.offerLast(o);
	}
	public Object pop(){
		return deque.pollLast();
	}
	public Object peek(){
		return deque.peekLast();
	}
	public int size(){
		return deque.size();
	}
	public static void main(String[] args) {		
		Stack stack=new Stack(5);
		stack.push("Hero");
		stack.push("Albert");
		stack.push("DaVinci");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
