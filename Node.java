
public class Node<T> {
	T value;
	Node<T> next;
	
	public Node(T value) {
		this.value = value;
		next = null;
	}
	public void setnext(Node<T> nod) {
		next = nod;
	}
	
}
