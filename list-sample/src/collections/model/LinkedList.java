package collections.model;

public class LinkedList {

	private ListNode head;
	private int size;

	// Add a new data to the list
	public void add(int data){
		ListNode listNode = new ListNode(data);
		// If the list is empty create the first element in it
		if(head==null){
			this.head = listNode;
			size = 1;
		} else{
			// If the list not empty, find out the final node and attach the newly created
			// ListNode after that
			ListNode current = head;
			// The next node of final node will be null, so go till that is reached
			while(current.getNext()!=null){
				current = current.getNext();
			}
			current.setNext(listNode);
			size++;
		}
	}

	// Return the data in the given index
	public Integer get(int index){
		Integer value = null;
		ListNode current = head;
		for(int i=0;current!=null && i<=index;i++){
			value = current.getData();
			if(index==i){
				break;
			}
			current = current.getNext();
		}
		return value;
	}

	public int size(){
		return size;
	}


}