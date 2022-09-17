
class Node{
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		next = null;
	}
}

class Stack{
	public static Node head;
	public static boolean isEmpty() {
		return head == null;
	}
	
	public static void push(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode; 
	}
	
	public static int pop() {
		if (isEmpty()) {
			return -1;
		}
		int top = head.data;
		head = head.next;
		return top;
	}
	
	public static int peek() {
		if (isEmpty()) {
			return -1;
		}
		return head.data;
	}
}

public class StackCreation {

	public static void main(String args[]){
		Stack stk = new Stack();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);

		while(!stk.isEmpty()){
			System.out.println(stk.peek());
			stk.pop();
		}
	}
	
}
