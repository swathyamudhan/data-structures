package applications.list;

import collections.model.ListNode;
import collections.model.LinkedList;

public class ListMain {

	public static void main(String...args){

		// How to use the list node
		// Do not directly use them
		ListNode head = new ListNode(10);
		ListNode node1 = new ListNode(20);
		ListNode node2 = new ListNode(30);
		ListNode node3 = new ListNode(40);

		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);

		ListNode current = head;
		while(current!=null){
			System.out.println(current);
			current = current.getNext();
		}

		// How to actually use the linked list
		LinkedList list = new LinkedList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}

	}
}