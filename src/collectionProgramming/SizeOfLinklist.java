package collectionProgramming;

import java.util.LinkedList;

public class SizeOfLinklist {
	public static void main(String[] args) {
		int size=0;
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		for(Integer l:list) {
			size++;
		}
		System.out.println(size);
	}

}
