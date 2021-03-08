package day20passbyvaluepassbyreferencedate;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {
	
	//Remove repeated elements from a list
	//Example: [a, b, c, b, a, a, d] ==> [a, b, c, d]

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("a");
		list.add("d");
		
		List<String> distinctList = new ArrayList<>();
		
		//1.Way
//		for(String w : list) {
//			if(distinctList.contains(w)) {
//				continue;
//			}
//			distinctList.add(w);
//		}
//		
//		System.out.println(distinctList);
		
		//2.Way
		for(String w : list) {
			if(!distinctList.contains(w)) {
				distinctList.add(w);
			}	
		}
		System.out.println(distinctList);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
