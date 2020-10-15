import java.util.*;
 
class Node {
	int value;
	Node prev;
	Node next;
	HashSet<Integer> set;
 
	public Node(int v){
		value = v;
		set = new HashSet<Integer>();
	}
 
	public String toString(){
		return value + ":" + set.toString();
	}
}
 
public class FrequentCollection {	
 
	HashMap<Integer, Node> map;
	Node head, tail;
 
	
	public FrequentCollection() {
		map = new HashMap<Integer, Node>();
	}
 
	/**
	 * Inserts a value to the collection. 
	 */
	public void insert(int val) {
		if(map.containsKey(val)){
			Node n = map.get(val);
			n.set.remove(val);
 
			if(n.next!=null){
				n.next.set.add(val); 
				map.put(val, n.next);
			}else{
				Node t = new Node(n.value+1);
				t.set.add(val);
				n.next = t;
				t.prev = n;
				map.put(val, t);
			}
 
			//update head
			if(head.next!=null)
				head = head.next;
		}else{
			if(tail==null||head==null){
				Node n = new Node(1);
				n.set.add(val);
				map.put(val, n);
 
				head = n;
				tail = n;
				return;
			}
 
			if(tail.value>1){
				Node n = new Node(1);
				n.set.add(val);
				map.put(val, n);
				tail.prev = n;
				n.next = tail;
				tail = n;
			}else{
				tail.set.add(val);
				map.put(val, tail);
			}
 
		}
 
 
	}
 
	/**
	 * Removes a value from the collection. 
	 */
	public void remove(int val) {
		Node n = map.get(val);
		n.set.remove(val);
 
		if(n.value==1){
			map.remove(val);
		}else{
			n.prev.set.add(val);
			map.put(val, n.prev);
		}
 
 
		while(head!=null && head.set.size()==0){
			head = head.prev;
		}
 
 
	}
 
	/** Get the most frequent element from the collection. */
	public int getMostFrequent() {
		if(head==null)
			return -1;
		else
			return head.set.iterator().next();
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequentCollection fc = new FrequentCollection();
		fc.insert(1);
		fc.insert(2);
		fc.insert(3);
		fc.insert(2);
		fc.insert(3);
		fc.insert(3);
		fc.insert(2);
		fc.insert(2);
 
		System.out.println(fc.getMostFrequent());
		fc.remove(2);
		fc.remove(2);
		System.out.println();
		System.out.println(fc.getMostFrequent());
		System.out.println(fc);
 
	}
}
