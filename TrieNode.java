
public class TrieNode<T> {
	T val;
	TrieNode<T>[] arr;
	TrieNode<T> paren;
	char ch;
	public TrieNode() {
		arr = new TrieNode[13];
		for(int j=0;j<13;j++) {
			arr[j] = null;
		}
		val = null;
	}
	
    public T getValue() {
        return val;
    }
    
    public void setVal(T val) {
    	this.val = val;
    }

}