package LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNew list = new LinkedListNew();
		
		list.insertAtHead(10);
		list.insertAtHead(12);
		list.insertAtHead(16);
		list.insertAtHead(45);
		
		list.deletenodefromhead();
		
		System.out.println(list.toString());
		System.out.println(list.length());
		
		System.out.println("Found: " + list.find(12));
	}

}
