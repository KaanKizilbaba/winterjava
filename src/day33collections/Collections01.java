package day33collections;

import java.util.LinkedHashSet;

public class Collections01 {
	
	/*
	 	LinkedHashSet: 
	 	1)It sorts the elements in insertion order
	 	2)It is fast in adding and removing operations
	 */

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("A");
		lhs1.add("B");
		
		LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
		lhs2.add("A");
		lhs2.add("C");
		lhs2.add("B");
		lhs2.add("X");
		
		//The hash code of a set is defined to be the sum of the hash codes of the elements in the set
		System.out.println(lhs1.hashCode());
		
		//If you want to get common elements from two collections, use retainAll()
		//If no element is deleted from the first collection retainAll() returns false.
		System.out.println(lhs2.retainAll(lhs1));
		
		System.out.println(lhs2);
		System.out.println(lhs1);

	}

}
