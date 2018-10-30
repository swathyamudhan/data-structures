package applications.list;

import collections.genericModel.LinkedList;

public class GenericListMain {

	public static void main(String...args){
		System.out.println("Printing wordList.....");
		
		// Saving String into a list
		LinkedList<String> wordList = new LinkedList<String>();
		wordList.add("Jon");
		wordList.add("Ron");
		wordList.add("Con");
		wordList.add("Mon");

		for(int i=0;i<wordList.size();i++){
			System.out.println(wordList.get(i));
		}

		// Saving integers into a list
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(11);
		numberList.add(12);
		numberList.add(13);
		numberList.add(14);
		numberList.add(15);

		System.out.println("Printing numberList.....");
		// Using the for each loop
		for(int i=0;i<numberList.size();i++){
			System.out.print(numberList.get(i)+" ");
		}
		System.out.println();
	}
}