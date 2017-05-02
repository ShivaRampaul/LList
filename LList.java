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
			Node ob = head;
			while (ob.next != null) {
				ob = ob.next;
				i++;
			}
			return i;
		}
	}

	void pushFront(int val) {
		if (head == null) {
			head = new Node(val);
		}
		else {
			Node ob = new Node(val);
			ob.next = head;
			head = ob;
		}
	}

	void printer() {
		Node ob = head;
		System.out.print(ob.data + "\t");
		while (ob.next != null) {
			ob = ob.next;
			System.out.print(ob.data + "\t");
		}
		System.out.println();
	}

	void printLength() {
		System.out.println("Length of list: " + this.length());
		System.out.println();
	}

	int pop() {
		int val = head.data;
		head = head.next;
		return val;
	}
}

class LList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(5);
		list.push(9);
		list.push(8);
		list.push(10);
		list.printer();
		list.printLength();

		list.pushFront(1);
		list.printer();
		list.printLength();

		System.out.println("Popped value: " + list.pop());
		System.out.println();
		list.printer();

		System.out.println();
		System.out.println("Current head: " + list.head.data);
		list.printLength();
	}
}