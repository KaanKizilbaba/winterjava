package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
	
	/*
	 	From an integer list find the closest two elements
	*/

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(13);
		list1.add(31);
		list1.add(21);
		list1.add(12);
		list1.add(16);
		list1.add(67);
		list1.add(35);
		list1.add(120);
		list1.add(168);
		list1.add(12);

		List<Integer> differences = new ArrayList<>();
		
		List<Integer> indexOfFirstNum = new ArrayList<>();
		List<Integer> indexOfSecondNum = new ArrayList<>();
		
		for(int i=0; i<list1.size(); i++) {
			for(int k=i+1; k<list1.size(); k++) {
				differences.add(Math.abs(list1.get(i) - list1.get(k)));
				indexOfFirstNum.add(i);
				indexOfSecondNum.add(k);
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<differences.size(); i++) {
			if(min>differences.get(i)) {
				min=differences.get(i);
			}
		}
		System.out.println(min);
		
		int idxMin = differences.indexOf(min);
		int idxFirst = indexOfFirstNum.get(idxMin);
		int idxSecond = indexOfSecondNum.get(idxMin);
		
		System.out.println("First number: " + list1.get(idxFirst));
		System.out.println("Second number: " + list1.get(idxSecond));

	}

}
