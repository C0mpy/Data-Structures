package linked_list;


public class App {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(7);
		list.add(13);
		list.add(1);
		list.add(4);
		System.out.println(list);

		Node nextToNewNode = list.get(2);
		Node newNode = new Node(-5);
		list.insert(nextToNewNode, newNode);
		System.out.println(list);
		
		Node nodeToDelete = list.get(2);
		list.delete(nodeToDelete);
		System.out.println(list);
		
	}
	
	
}