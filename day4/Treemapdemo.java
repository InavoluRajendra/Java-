package com.org.tav.day4;

import java.util.Map;
import java.util.TreeMap;

//underlying ds is redblack tree
//only unique elements
//cannot have null key but can have multiple null values
//not synchronized
//ascending order
//iterator returned by tree map is fail-fast means we cannot modify  during iteration 
//firstkey,lastkey,keyset,entryset,object clone,Map.Entry<k,v>,ceilingEntry<K key>,floorkey,higherkey
//replace,pollfirst,polllast
public class Treemapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(25, "john");tm.put(31, "raju");
		tm.put(23, "rose");
		tm.put(35, "peter");
		tm.put(24, "rocky");
		System.out.println("sorted map:"+tm);
		System.out.println("descending ordermap:"+tm.descendingMap());
		System.out.println("head map:"+tm.headMap(24,true));
		System.out.println("tailmap:"+tm.tailMap(30,true));
		System.out.println("submap:"+tm.subMap(22, false, 32, false));
		System.out.println("ceiling key"+tm.ceilingKey(22));
		System.out.println("ceiling entry"+tm.ceilingEntry(22));
		System.out.println("firstkey"+tm.firstKey());
		System.out.println("last key"+tm.lastKey());
		System.out.println("display");tm.replace(24, "dhan");
		for(Map.Entry<Integer, String>entry:tm.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
			
	}

}
