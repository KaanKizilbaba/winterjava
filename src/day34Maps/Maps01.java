package day34Maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("cat", 3);
		hm1.put("caterpillar", 11);
		hm1.put("lion", 4);
		hm1.put("tiger", 5);
		//If you send existing key value into a map, map overwrites, it means updates the value
		hm1.put("cat", 999);
		
		HashMap<String, Integer> hm2 = new HashMap<>();
		hm2.put("cat", 3);
		hm2.put("caterpillar", 11);
		hm2.put("lion", 4);
		hm2.put("tiger", 5);
		
		System.out.println(hm1);
		
		System.out.println(hm1.keySet());
		System.out.println(hm1.values());
		
		System.out.println(hm1.containsKey("cat"));//true
		System.out.println(hm1.containsValue(11));//true
		
		System.out.println(hm1.entrySet());
		//equals() does not check order of elements
		System.out.println(hm1.equals(hm2));
		
		//To get value of a specific key, use get() method
		System.out.println(hm1.get("cat"));//3
		//get() method returns "null" for non-existing keys
		System.out.println(hm1.get("Snake"));//null
		
		//getOrDefault() method returns the value if the key exists otherwise returns the given value
		//which is used in method call
		System.out.println(hm1.getOrDefault("Snake",404));
		
		//It puts all elements from "hm2" into "hm1"				
		hm1.putAll(hm2);//{caterpillar=11, cat=3, tiger=5, lion=4}
		System.out.println(hm1);
		
		//compute() method is used to update "value" of a specific key
		//By using compute() method, you cannot update the key
		//If you use compute() method with a non-existing key, you will get "NullPointerException"
		hm1.compute("lion", (key, value)->value+5);
		hm1.compute("tiger", (key, value)->value=555);
		hm1.compute("tiger", (key, value)->value=key.length()+11);

		//computeIfPresent() method updates the value of key, if the key exists
		//If the key does not exist it does not do anything
		hm1.computeIfPresent("caterpillarXXX", (key, value)-> value+9);
		
		//computeIfAbsent() executed if the key does not exist, if the key exists it does not run
		hm1.computeIfAbsent("catXXX", k -> 5);
		
		hm1.putIfAbsent("catYYYY", 1000);
		
		System.out.println(hm1);

	}

}
