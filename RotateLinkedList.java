// Rotates the linked list k elemets from the last

// e.g roatate the given linked list k=2 elements from the last.
//     GIVEN:   3->5->2->8->7->1
//     RETURNS: 7->1->3->5->2->8
//     EXAMPLE: ll.rotate(2) = 7->1->3->5->2->8

class Node {
	 int data;
	 Node next;

	 public Node(int data) {
	 	this.next = null;
	 	this.data = data;
	 }
}

class LinkedList {

	Node head;

	public LinkedList() {
		this.head = null;
	}

	public void addData(int data) {
		Node current = this.head;
		if (this.head != null) {
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		} else {
			this.head = new Node(data);
		}
	}

	public void printLL() {
		Node current = this.head;
		if (this.head != null) {
			while (current.next != null) {
				System.out.print(current.data + "->");
				current = current.next;
			}
			System.out.println(current.data);
		} else {
				System.out.print("Empty LinkedList");
			}
	}

	public int getSize() {
		Node current = this.head;
		int count = 0;
		if(this.head != null) {
			while(current!=null) {
				count += 1;
				current = current.next;
			}
		}
		return count;
	}

	public void rotateLL(int k) {
		int t = this.getSize() - k - 1;
		Node current = this.head;
		while (t > 0) {
			current = current.next;
			t -= 1;
		}
		Node temp = this.head;
		Node temp2 = current.next;
		this.head = current.next;
		current.next = null;
		while (temp2.next != null) {
			temp2 = temp2.next;
		}
		temp2.next = temp;
	}
}

public class RotateLinkedList {

	public static void main(String[] args) {

		LinkedList ll =  new LinkedList();
		ll.addData(3);
		ll.addData(5);
		ll.addData(2);
		ll.addData(8);
		ll.addData(7);
		ll.addData(1);
		ll.printLL();
		ll.rotateLL(2);
		ll.printLL();
	}
}