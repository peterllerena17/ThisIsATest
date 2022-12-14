package linked;

public class LinkedList {
	
	private Node head;
	
	public void insertAtHead(int data) {
		Node newNode = new Node (data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	
	
	// method to retrieve length
	public int length() {
		int length = 0;
		Node current = this.head;
		while(current != null) {
			length ++;
			current = current.getNextNode();
		}
		return length;
	}
	
	// method to delete
	public void deleteFromHead() {
		this.head = this.head.getNextNode();	
	}
	
	// Find method to search
	public Node find(int data) {
		Node current = this.head;
		while(current != null){
			if(current.getData() == data) {
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}
	
	
	// method to print
	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		
		while (current!= null) {
			result += current.toString() +  ",";
			current = current.getNextNode();
		}
		result += "}";
		return result;
	}
	
}
