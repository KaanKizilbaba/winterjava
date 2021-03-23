package day28exceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PokerTask {

	public static void main(String[] args) {
		PokerHand ph = new PokerHand("8C,9C,10C,JC,QC");
		ph.isGreaterThan(ph);
	}

	public static void testHand1IsGreaterThanHand2(String hand1AsString, String hand2AsString, Boolean expectedResult) {
		PokerHand hand1 = new PokerHand(hand1AsString);
		PokerHand hand2 = new PokerHand(hand2AsString);
		System.out.println("Hand1[" + hand1 + "] > Hand2[" + hand2 + "] \t-- " + "expected: " + expectedResult
				+ ", actual: " + hand1.isGreaterThan(hand2));
	}

}

class PokerHand {

    private String handAsString;

    public PokerHand(String hand) {
       handAsString = hand;
    }

    public Boolean isGreaterThan(PokerHand hand2) {
    	
       // This is where you'll implement the poker hand comparison logic
    	String arr[] = hand2.toString().split(",");	
    	
		List<String> suits = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
    	    suits.add(arr[i].substring(arr[i].length()-1));
        }
        Set<String> uniqueSuit = new HashSet<>(suits);
        boolean isUniqueSuit = uniqueSuit.size()==1;
        System.out.println(isUniqueSuit);
        
        List<String> identifiers = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
        	identifiers.add(arr[i].substring(0,arr[i].length()-1));
        }
        
        Collections.sort(identifiers);
        
        System.out.println(suits);
        System.out.println(identifiers);
        
        
        
        
       return false;
    }

    @Override
    public String toString() {
       return handAsString;
    }
 }
