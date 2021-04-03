package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class LambdaWithStrings {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
        
        printStartsWithA(list);
        System.out.println();
        printStartsWithAOrO(list);
        System.out.println();
        sortWithLength(list);
        System.out.println();
        sortWithLast(list);
        System.out.println();
        getCharAndLength(list);
        System.out.println();
        removeLessThanFive(list);

	}
	
	/*
	 	1)Functional Programming
	 	Create a method to print list elements which are starting with "A" in uppercases
	*/
	public static void printStartsWithA(List<String> l) {
		
		l.stream().filter(t->t.startsWith("A")).forEach(t->System.out.print(t.toUpperCase() + " "));
		
	}
	/*
	 	2)Functional Programming
	 	Create a method to print list elements which are starting with "A" or ending with "o" in lowercases
    */
	public static void printStartsWithAOrO(List<String> l) {	
		l.stream().filter(t->t.startsWith("A") || t.endsWith("o")).map(t->t.toLowerCase()).forEach(t->System.out.print(t + " "));
	}
	/*
	 	3)Functional Programming
	 	Create a method to print the elements in uppercases after ordering according to their lengths 
	 	
	 	Note: sorted() method puts the elements in natural order
	 	      sorted(Comparator.comparing(t->t.length())) method puts the elements in order by using their lengths
    */
	public static void sortWithLength(List<String> l) {
		l.stream().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t->System.out.print(t + " "));
	}
	/*
	 	4)Functional Programming
	 	Create a method to print the elements in lowercases after ordering according to their last characters 
	*/
	public static void sortWithLast(List<String> l) {	
		l.stream()
		 .map(t->t.toLowerCase())
		 .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
		 .forEach(t->System.out.print(t+ " "));
	}
	/*
	  5)Use "Functional Programming"
	  Create a method to print the length of every element in the following format.
	  Sort by length.
	  Ali: 3        Mark: 4       Amanda: 6     etc.
	*/
	public static void getCharAndLength(List<String> l) {
		
		l.stream()
		 .sorted(Comparator.comparing(t->t.length()))
		 .map(t->t + ":" + t.length())
		 .forEach(t->System.out.print(t + " "));
		
	}
	/*
	  6)Use "Functional Programming"
	  Create a method to remove the element if the length is less than 5
	*/
	public static void removeLessThanFive(List<String> l) {
		
		l.stream().filter(t->t.length()>=5).forEach(t->System.out.print(t + " "));
	}
	
	
	
	
	
	
	
	
	
	
	
	

}











