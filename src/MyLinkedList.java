import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyLinkedList {
	private Node head;
	private int numberOfOrders = 0;
	public class Node {
		Node next;
		String order;
		
		public Node(String order, Node next) {
			this.next = next;
			this.order = order;
			
		}
	}
	
	public String[] getAllPanels() {
		String[] fiveOrders = new String[5];
		int counter = 0;
		for(Node temp = head; temp != null && counter < 5; temp = temp.next) {
			fiveOrders[counter] = temp.order;
			counter++;
		}
		return fiveOrders;
	}
	
	public void pop() {
		if(head == null) {
			return;
		}
		
		Node current = head;
		Node previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		
		if(head.next != null) {
			previous.next = null;
		}
		else
			head = null;
		numberOfOrders--;
	}
	public void add(String order) {
		
		head = new Node(order, head);
		numberOfOrders++;
	}
	
	public int getNumberOfOrders() {
		return numberOfOrders;
	}
	
	public  void printList() {
		int counter = 0;
		for(Node temp = head; temp != null; temp = temp.next) {
				System.out.println(temp.order);
			counter++;
		}
		
		for(int i =0; i < 5-counter; i++) {
			System.out.println("null");
		}
	}
	
}