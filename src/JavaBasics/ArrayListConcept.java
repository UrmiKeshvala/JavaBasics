package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		ar.add("M");
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		ar.remove(6);
		
		System.out.println(ar.size());
		
		//Display all the values
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
			
		}
		

	}

}
