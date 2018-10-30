package collections.genericModel;

/**
** A generic linked list implementation
**/
public class LinkedList<T> {

	private ListNode<T> head;
	private int size;

	public void add(T data){
		ListNode<T> listNode = new ListNode<>(data);
		if(head==null){
			this.head = listNode;
			size = 1;
		} else{
			ListNode<T> current = head;
			while(current.getNext()!=null){
				current = current.getNext();
			}
			current.setNext(listNode);
			size++;
		}
	}

	public T get(int index){
		T value = null;
		ListNode<T> current = head;
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