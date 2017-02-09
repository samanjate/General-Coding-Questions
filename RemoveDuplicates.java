// Removes Duplicates from a Linked List

// e.g 1->3->5->1->1->1->1->7->5->9->5->5->5->5
//     1->3->5->7->9

import java.util.ArrayList;

class Node {
	int data;
	Node next;

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
		Node current = this.head;
		if (current != null) {
			while(current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		} else {
			this.head = new Node(data);
		}
	}

	public void printLL() {
		Node current  = this.head;
		if (current != null) {
			while(current.next != null) {
				System.out.print(current.data+"->");
				current = current.next;
			}
			System.out.print(current.data);
			System.out.println();
		}
	}

	public void removeDuplicates() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Node previous = null;
		Node current = this.head;
		if(current != null) {
			while(current != null) {
				if(arr.contains(current.data)) {
					previous.next = current.next;
					current = current.next;
					continue;
				} else {
					arr.add(current.data);
					previous = current;
					current = current.next;
				}
			}
		}
	}
}

public class RemoveDuplicates {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addData(1);
		ll.addData(3);
		ll.addData(5);
		ll.addData(1);
		ll.addData(1);
		ll.addData(1);
		ll.addData(1);
		ll.addData(7);
		ll.addData(5);
		ll.addData(9);
		ll.addData(5);
		ll.addData(5);
		ll.addData(5);
		ll.addData(5);
		ll.printLL();
		ll.removeDuplicates();
		ll.printLL();
	}
}