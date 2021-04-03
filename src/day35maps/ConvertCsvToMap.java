package day35maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertCsvToMap {
	
	/*
	 	Read a csv file and convert it to a Map
	 	csv ==> Name, Ali            ==> Map: {Name=Ali, Id=101, Address=Miami}
	 			Id, 101
	 			Address, Miami
	*/

	public static void main(String[] args) {
		
		System.out.println(convertCsvToMap());
	}
	
	public static Map<String, String> convertCsvToMap(){
		
		BufferedReader br;
		List<String> linesList = new ArrayList<>();
		HashMap<String, String> hm = new HashMap<>();
		
		try {
			br = new BufferedReader(new FileReader("/Users/apple/Downloads/eclipse-workspace/winterjava/src/day35maps/myFile.csv"));
			
			String lines = br.readLine();
			
			while(lines!=null) {
				linesList.add(lines);
				lines = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("File could not be read" + e.getMessage());
		}
		
		for(String w : linesList) {
			
			String arr[] = w.split(",");
			hm.put(arr[0].trim(), arr[1].trim());
			
		}
		return hm;	
	}

}
