// Reverses a given Linked List

// e.g, $ 5->9->3->2->7
//      $ Reversed Linked List : 7->2->3->9->5

class Node {

	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {

	Node head;

	public LinkedList() {
		this.head = null;
	}

	public void addData(int data) {
		if (this.head == null) {
			this.head = new Node(data);
		} else {
			Node current = head;
			while(true) {
				if(current.next == null) {
					break;
				} else {
					current = current.next;
				}
			}
			current.next = new Node(data);
		}
	}

	public void printLL() {
		if(this.head != null) {
			Node current = this.head;
			System.out.print(current.data);
			current = current.next;

			while(current != null) {
				System.out.print("->" + current.data);
				current = current.next;
			}
			System.out.println();
			}
	}

	public void reverseLL() {
		if (this.head != null) {
			Node previous_node = null;
			Node current_node = this.head;
			Node next_node = this.head.next;
			while (current_node.next != null) {
				current_node.next = previous_node;
				previous_node = current_node;
				current_node = next_node;
				next_node = current_node.next;
			}
			current_node.next = previous_node;
			previous_node = current_node;
			this.head = previous_node;
		}
	}

}

public class Practice {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addData(5);
		ll.addData(9);
		ll.addData(3);
		ll.addData(2);
		ll.addData(7);
		ll.printLL();
		ll.reverseLL();
		System.out.print("Reversed Linked List : ");	
		ll.printLL();
	}
}
