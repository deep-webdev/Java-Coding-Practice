
public class LL {
	
	Node head;
	private int size;
	
	LL(){
		this.size = 0;
	}
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			size ++;
		}
	}
	
	// add element at first position
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	// add element at last position
	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;	
	}
	
	public void printList() {
		if (head == null) {
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " --> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
		
	}
	// delete first element from linked list
	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size --;
		head = head.next;
	}
	
	// delete last element from linked list
	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size --;
		Node currNode = head;
		Node previous = head;
		while (currNode.next != null) {
			previous = currNode;
			currNode = currNode.next;
		}
		previous.next = null;
		
	}
	
	public int getSize() {
		return size;
	}
	
	public void reverseLinkedList() {
		if (head == null || head.next == null) {
			return;
		}
		Node prevNode = head;
		Node currNode = head.next;
		
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
		
	}
	
	public Node reverseRecursive(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node nextNode = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return nextNode;
	}
	
	public static void main(String args[]) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		list.addLast("list");
		list.addFirst("this");
		list.printList();
//		list.reverseLinkedList();
		list.head = list.reverseRecursive(list.head);
		list.printList();
	}
}
