package generic;

public class LinkedList<T> implements List<T> {
    private class Node<Y> {
		public Node<Y> previous;
		public Node<Y> next;
		public Y payload;

        public Node(Y payload) {
            this.previous = null;
            this.next = null;
            this.payload = payload;
        }
	}
	
	private Node<T> head;
    private Node<T> tail;

    private int size;

    public LinkedList() {
        this.head = new Node(null);
        this.head.next = this.tail;
        this.head.previous = null;

        this.tail = new Node(null);
        this.tail.previous = this.head;
        this.tail.next = null;

        this.size = 0;
    }

    public void add(T element) {
        Node<T> newNode = new Node(element);
        newNode.previous = this.tail.previous;
        this.tail.previous.next = newNode;
        newNode.next = this.tail;
        this.tail.previous = newNode;
        ++this.size;
    }

    //position = 1, n
	public void put(T element, int position) {
        if (position > this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<T> current = this.head.next;
        for (int i = 1; i < position - 1; ++i) {
            current = current.next;
        }
        Node<T> temp = current.next;
        Node<T> newNode = new Node(element);
        current.next = newNode;
        temp.previous = newNode;
        ++this.size;
    }

    //position = 1, n
	public void remove(int position) {
        if (position > this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<T> current = this.head.next;
        for (int i = 1; i < position; ++i) {
            current = current.next;
        }
        Node<T> temp = current.previous;
        current.previous.next = current.next;
        current.next.previous = temp;
        --this.size;
    }

	public int find(T element) {
        Node<T> current = this.head.next;
        for (int i = 1; i <= this.size; ++i) {
            if (current.payload == element) {
                return i;
            }
            current = current.next;
        }
        if (current.payload == element) {
            return this.size;
        }
        return Integer.MIN_VALUE;
    }

    //index = 1, n
	public T get(int index) {
        if (index > this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<T> current = this.head.next;
        for (int i = 1; i < index; ++i) {
            current = current.next;
        }
        return current.payload;
    }
}
