

public class Trie<T> {
	
	TrieNode<T> root;
	public Trie() {
		root = null;
	}
	
	public boolean delete(String word) {
    	if(root==null) {
//    		System.out.println("ERROR DELETING");
    		return false;
    	}
    	TrieNode<T> curr = root;
    	int y = word.length();
    	for(int i=0;i<y;i++) {
    		char c = word.charAt(i);
    		int k = c - '-';
    		if(curr.arr[k]!=null) {
    			if(i==y-1) {
    				if(curr.arr[k].getValue()!=null) {
//    					curr.arr[k] = null;
//    					curr = curr.arr[k];
    					for(int p=i;p>=0;p--) {
    						c = word.charAt(p);
    			    		k = c - '.';
    			    		if(curr==null) {
    			    			curr = curr.paren;
    			    		}
    			    		else {
    			    			curr.arr[k] = null;
    			    			if(curr.getValue()!=null) {
    			    				if(p==i) {
    			    					curr.setVal(null);
    			    				}
    			    				else {
//    			    					System.out.println("jdbnijdb");
//    			    					curr.arr[k] = null;
//    			    					System.out.println("DELETED");
        			    				return true;
    			    				}
        			    		}
//        						curr.arr[k] = null;
        						for(int j=0;j<12;j++) {
        							if(curr.arr[j]!=null&&p!=i) {
//        								System.out.println("kjbnbbj");
//        								System.out.println("DELETED");
        								return true;
        							}
        						}
//        						curr.arr[k] = null;
        						TrieNode<T> nod = curr.paren;
        						curr = nod;
        						if(p!=i) {
        							curr.arr[k] = null;
//        							System.out.println(k);
        						}
//        						curr.arr[k] = null;
    			    		}
    					}
//    					System.out.println("DELETED");
    					return true;
    				}
    				else {
//    					System.out.println("ERROR DELETING");
    					return false;
    				}
    			}
    		}
    		else {
//    			System.out.println("ERROR DELETING");
    			return false;
    		}
    		curr = curr.arr[k];
    	}
//    	System.out.println("ERROR DELETING");
        return false;
    }
	
	public TrieNode search(String word) {
    	if(root==null) {
    		//System.out.println("32");
    		return null;
    	}
    	else {
    		int y = word.length();
    		TrieNode<T> curr = root;
    		for(int i=0;i<y;i++) {
    			char c = word.charAt(i);
    			int k = c - '-';
    			if(curr.arr[k]!=null) {
    				if(i==y-1) {
	    				if(curr.arr[k].getValue()!=null) {
	    					return curr.arr[k];
	    				}
	    				else {
	    					//System.out.println("32");
	    					return null;
	    				}
    				}
    			}
    			else {
//    				System.out.println("32");
    				return null;
    			}
    			curr = curr.arr[k];
    		}
    	}
        return null;
    }
	
	public boolean insert(String word, Object value) {
    	int y = word.length();
    	//System.out.println("21");
    	if(root==null) {
    		//System.out.println("22");
    		root = new TrieNode();
    	}
    	TrieNode<T> curr = root;
    	for(int i=0;i<y;i++) {
			char c = word.charAt(i);
			int k = c - '-';
//			System.out.println(k);
			if(curr.arr[k]==null) {
				curr.arr[k] = new TrieNode();
				curr.arr[k].ch = c;
				if(i==y-1) {
					curr.arr[k].setVal((T) value);		//casting;
					return true;
				}
			}
			else if(i==(y-1)) {
				if(curr.arr[k].getValue()==null) {
					curr.arr[k].setVal((T) value);     //casting;
					return true;
				}
				else {
					return false;
				}
			}
			TrieNode<T> pare = curr;
			curr = curr.arr[k];
			curr.paren = pare;
		}
        return false;
    }
}
