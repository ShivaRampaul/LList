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
			Node ob = head;
			while (ob.next != null) {
				ob = ob.next;
			}
			ob.next = new Node(val);
		}
	}

	int length() {
		if (head == null) {
			int i = 0;
			return i;
		}
		else {
			int i = 1;
			Node ob1 = head;
			while (ob1.next != null) {
				ob1 = ob1.next;
				i++;
			}
			return i;
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
		list.push(10);
		System.out.println(list.length());
	}
}