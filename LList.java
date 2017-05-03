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

	// constructor
	LinkedList() {
		head = null;
	}

	// adds val to end of list
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

	// totals length of list
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

	// adds val to beginning of list
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

	// printer method
	void printer() {
		Node ob = head;
		System.out.print("Current list: \t" + ob.data + " ");
		while (ob.next != null) {
			ob = ob.next;
			System.out.print(ob.data + " ");
		}
		System.out.println();
	}

	// prints length of the list
	void printLength() {
		System.out.println("Length of list: " + this.length());
		System.out.println();
	}

	// removes val from beginning of list
	int pop() {
		int val = head.data;
		head = head.next;
		return val;
	}

	// removes val from end of list
	int popBack() {
		int i = 1;
		Node ob = head;
		// last object
		while (ob.next != null) {
			ob = ob.next;
			i++;
		}
		int j = 1;
		// second to last object
		Node ob1 = head;
		for (; j < i - 1; j++) {
			ob1 = ob1.next;
		}
		int val = ob1.next.data;
		ob1.next = null;
		return val;
	}

	// removes x from the list
	boolean remove(int x) {
		Node ob = head;
		int i = 0;
		if (ob.data == x) {
			head = ob.next;
		}
		while (ob.next != null) {
			if (ob.next.data == x) {
				ob.next = ob.next.next;
				i++;
				continue;
			}
			ob = ob.next;
		}
		if (i > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	// find x in list and returns true
	boolean find(int val) {
		Node ob = head;
		while (ob.next != null) {
			if (ob.data == val) {
				return true;
			}
			ob = ob.next;
		}
		return false;
	}
}

class LList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// pushing numbers to end of list list
		list.push(9);
		list.push(5);
		list.push(9);
		list.push(9);
		list.push(1);
		list.push(10);
		list.push(9);
		list.push(15);

		// print list
		System.out.println();
		list.printer();
		list.printLength();

		// adds 1 to end of list
		System.out.println("pushing...");
		list.pushFront(1);
		list.printer();
		list.printLength();

		// removes 1 from front of list
		System.out.println("popping...");
		System.out.println("Popped value: " + list.pop());
		list.printer();

		System.out.println();

		// removes object at end of list
		System.out.println("popping...");
		System.out.println("Popped value: " + list.popBack());
		list.printer();
		list.printLength();

		// removes x from the list and returns true 
		System.out.println("removing...");
		System.out.println(list.remove(9));
		list.printer();

		// finds a value and returns true
		System.out.println();
		System.out.println("finding...");
		System.out.println(list.find(8));
		list.printer();
	}
}