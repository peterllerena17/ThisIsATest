package linked;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(12);
		list.insertAtHead(19);
		list.insertAtHead(20);
		
		
		list.deleteFromHead();
		
		// print out list
		System.out.println(list);
		
		// print out length of list
		System.out.println("Length: " + list.length());
		
		System.out.println("Found: " + list.find(10));
		
	
	}
	
	

}
