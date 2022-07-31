package linked;

public class DoublyLinkedNode {
	private int data;
	private DoublyLinkedNode nextNode;
	private DoublyLinkedNode previousNode;
	public int getData() {
		return data;
	}
	
	// constructor
	public DoublyLinkedNode(int data) {
		this.data = data;
	}
	
	
	// getters and setters
	public void setData(int data) {
		this.data = data;
	}
	
	public DoublyLinkedNode getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(DoublyLinkedNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public DoublyLinkedNode getPreviousNode() {
		return previousNode;
	}
	
	public void setPreviousNode(DoublyLinkedNode previousNode) {
		this.previousNode = previousNode;
	}
	
	
	
}
