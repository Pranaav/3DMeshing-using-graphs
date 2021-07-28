
public class LinkedList<T> {
	Node<T> head;
	Node<T> curr;
	int size = 0;
	public LinkedList() {
		head = null;
		curr = null;
	}
	public void add(T val) {
		Node<T> n = new Node(val);
		if(head==null) {
			head = n;
			curr = head;
		}
		else {
//			head.next = n;
			curr.next = n;
			curr = curr.next;
		}
		size++;
	}
	public int size() {
		return size;
	}
}
