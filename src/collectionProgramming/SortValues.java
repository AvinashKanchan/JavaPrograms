package collectionProgramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;


public class SortValues {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		map.put(4,"Four");
		map.put(5,"Five");
		map.put(6, "Six");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		System.out.println(map);
		Collection<String> col = map.values();
		ArrayList<String> list=new ArrayList<String>(col);
		Collections.sort(list);
		System.out.println(list);
		}	

}
