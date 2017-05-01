class Node {
	int data;
	Node next;

	Node(int x) {
		data = x;
		next = null;
	}
}

class LinkedList {
	Node head;

	LinkedList() {
		head = null;
	}

	void push(int val) {
		if (head == null) {
			head = new Node(val);
		}
		else {
			// head.next = new Node(val);
			Node ob = head;
			while (ob.next != null) {
				ob = ob.next;
			}
			ob.next = new Node(val);
		}

	}

	// pushFront(int val) {

	// }
}

class LList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(5);
		System.out.println(list.head.data);
		list.push(9);
		System.out.println(list.head.next.data);
		list.push(8);
		System.out.println(list.head.next.next.data);
	}
}