package collectionProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

public class SortKeysInDescendingOrder {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		map.put(4,"Four");
		map.put(5,"Five");
		map.put(6, "Six");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		System.out.println(map);
		Set<Integer> set = map.keySet();
		ArrayList<Integer> list=new ArrayList<Integer>(set);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		}	
}
