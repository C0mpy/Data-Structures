package linked_list;


public class LinkedList {
	
	private Node head;
	private Node tail;
	
	public void add(Integer element) {
		
		Node newNode = new Node(element);
		
		// if its the first Node in the List
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		// if its not the first Node in the List
		else {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
		}
		tail = newNode;
		
	}
	

	public Node get(Integer index) {
		Node current = head;
		Integer counter = 0;
		
		while(counter != index) {
			current = current.getNext();
			counter ++;
		}
		
		return current;
		
	}
	
	public Node find(Integer data) {
		Node current = head;
		
		while(current.getData() != data) {
			current = current.getNext();
		}
		
		return current;
	}
	
	public void insert(Node nextToNewNode, Node newNode) {
		Node previousToNewNode = nextToNewNode.getPrevious();
		
		previousToNewNode.setNext(newNode);
		newNode.setPrevious(previousToNewNode);
		
		nextToNewNode.setPrevious(newNode);
		newNode.setNext(nextToNewNode);
	}
	
	public void delete(Node nodeToDelete) {
		Node nodeToDeletesPrevious = nodeToDelete.getPrevious();
		Node nodeToDeletesNext = nodeToDelete.getNext();
		
		nodeToDeletesPrevious.setNext(nodeToDeletesNext);
		nodeToDeletesNext.setPrevious(nodeToDeletesPrevious);
	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}

}
