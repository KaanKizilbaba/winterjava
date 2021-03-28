package day32Collections;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Collections01 {

	/*
	 	Collections are a)List(interface) ==> i)ArrayList(Class) ii)LinkedList(Class)
	 						List<Integer> list5 = new ArrayList<>();
	 						List<Integer> list5 = new LinkedList<>();
	 						
	 					b)Queue(interface) ==> i)PriorityQueue(Class) ii)Deque(interface)
	 					
	 					c)Set(interface) ==> i)HashSet(Class) ii)LinkedHashSet(Class) 
	 										 iii)SortedSet(interface) ==> iv)TreeSet(Class) 
	 										 
	   LinkedList: 1)It is a class
	   			   2)It is good at "adding" and "removing" elements
	   			   3)Every element is connected with eachother
	   			   4)Every element has "data" and "pointer" parts
	   			   5)Elements are called as "node"
	   			   6)Every linkedlist has "head" part, "head" has just "pointer" part
	   			   7)Last element is called "tail" in linkedlist, it points "null"
	   			   8)It is not successfull in searching elements and updating elements.
	 */

	public static void main(String[] args) {
		
		//If you want to use Queue methods for a linked list use "Queue" as data type
		//If you want to use List methods for a linked list use "List" as data type
		LinkedList<String> ll1 = new LinkedList<>();
		
		LinkedList<String> ll2 = new LinkedList<>();
		ll2.add("!");
		ll2.add("?");
		
		ll1.add(0,"A");
		ll1.add(0,"B");
		ll1.add("C");
		ll1.addAll(ll2);
		ll1.addAll(1, ll2);
		
		ll1.addFirst("X");
		ll1.addLast("Z");
		
		System.out.println(ll1.element());//Returns first element, it is coming from Queue
		                                  //throws NoSuchElementException if the list is empty
		System.out.println(ll1.peek());//Returns first element, it is coming from Queue
				                       //Returns "null" if the list is empty
		
		System.out.println(ll1.getFirst());//Returns first element, it is coming from Queue
        								   //throws NoSuchElementException if the list is empty	
		System.out.println(ll1.getLast());//Returns last element, it is coming from Queue
		                                  //throws NoSuchElementException if the list is empty
		
		System.out.println("==>" + ll1.poll());//Retrieves and removes the first element of this list.
		                               //Returns "null" if the list is empty
		ll1.offer("Y"); 

		System.out.println(ll1);

	}

}
