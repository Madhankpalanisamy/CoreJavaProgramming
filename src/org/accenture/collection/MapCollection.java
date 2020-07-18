package org.accenture.collection;

import java.util.*;
import java.util.Map.Entry;

public class MapCollection {

	public static void main(String[] args) {
		
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(0, "c");
		mp.put(1, "c++");
		mp.put(2, "java");
		mp.put(3, ".Net");
		mp.put(4, "mysql");
		Set<Integer> keySet = mp.keySet();
		System.out.println("Key : "+keySet);
		
		Collection<String> values = mp.values();
		System.out.println("Values"+values);
		
		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		System.out.println("Key and Value pair" +entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		
		
		

	}

}
