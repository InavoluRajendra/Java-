package com.org.tav.day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "raju");
		map.put(2, "den");
		map.put(3, "don");
		map.put(4, "vasu");
		System.out.println("entries in map");
		int size=map.size();
		System.out.println("no of entries is"+size);
		//hashmap allow one nullkey
		//treemap not allow any null keys
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(115, "brown");
		map2.put(116, "purple");
		map2.put(120, "green");
		map.putAll(map2);
		System.out.println("iterating using foreach");
		//foreach method is extended by iterable interface used to iterate through the collection
		map.forEach((k,v)->System.out.println("color id"+k+"name"+v));
		
		for(Map.Entry<Integer,String>entry:map.entrySet())
		{System.out.println("iterating entries");
		System.out.println("color id "+entry.getKey()+" color name "+entry.getValue());
		
		}
		for(Integer id:map.keySet())
			System.out.println("id"+id);
		System.out.println();
		
		for(String s:map.values())
			System.out.println("values "+s);
		

	}

}
