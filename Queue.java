// This class implements the Queue
public class Queue<V> {

    //TODO Complete the Queue implementation
    private LinkedList<V> queue;
    private int capacity, currentSize;
	private Node<V> nod;
    public Queue() {    
    	this.capacity = capacity;
    	queue = new LinkedList();
    	this.currentSize = 0;
//    	this.front = 0;
//    	this.rear = 0;
    	nod = null;
    }

    public int size() {
    	return currentSize;
    }

    public boolean isEmpty() {
    	if(currentSize==0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public void enqueue(V node) {
    	queue.add(node);
    	
//    	rear = (rear +1)%capacity;
    	currentSize++;
    }

    public V dequeue() {
    	if(queue.head==null) {
    		return null;
    	}
//    	@SuppressWarnings("unchecked")
		Node<V> nd = queue.head;
    	queue.head = nd.next;
    	currentSize--;
    	return nd.value;
    }

}

