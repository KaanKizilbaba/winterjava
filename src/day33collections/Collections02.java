package day33collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collections02 {
	
	/*
	 	Queue:
	 	1)PriorityQueue puts the elements in order according to a rule which Java decides
	 	  If we want, we can create a rule, and order the elements according to our rules.
	 	2)PriorityQueue is used in FIFO
	 */

	public static void main(String[] args) {
		
		Queue<String> q1 = new PriorityQueue<>();
		q1.add("Ali");
		q1.add("Veli");
		q1.add("Can");
		q1.add("Mary");
		
		System.out.println(q1);
		
		q1.element();//copy+paste
		q1.peek();//copy+paste
		q1.poll();//cut+paste
		
		//Deque: Double Ended Queue
		//If you want to use FIFO and LIFO together, you can use Deque
		Deque<String> dq1 = new LinkedList<>();

	}

}
