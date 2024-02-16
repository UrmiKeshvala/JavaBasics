package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable hs = new Hashtable();
		hs.put("A", "Test");
		hs.put("B", "Hello");
		hs.put("C", "World");
		
		System.out.println(hs.size());
		
		hs.put(1, 100);
		hs.put(2, 200);
		
		System.out.println(hs.size());
		

		System.out.println(hs.get(2));
		
		hs.put(3, "Tom");
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>(); //Restict to add integers only
		h1.put(1, 100);
	}

}
