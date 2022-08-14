package com.org.tav.day4;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linkedhashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> lmap=new LinkedHashMap<String,Integer>();
		int siz=lmap.size();
		lmap.put("raju",1);
		lmap.put("den",2);
		lmap.put("don",3);
		lmap.put("vasu",4);
		System.out.println("initial"+lmap);
		LinkedHashMap<String, String> lmap2=new LinkedHashMap<String,String>(16,0.75f,true);
		//if true order changes
		lmap2.put("en","english");
		lmap2.put("hi", "hindi");
		lmap2.put("te", "telugu");
		lmap2.put("ge","german");
		System.out.println("entries of map"+lmap2);
		System.out.println("value for to key hi-"+lmap2.get("hi"));
		
		LinkedHashMap<String, String> map3 = new LinkedHashMap<>(16,0.75f,false);
		//if false maintains order
		map3.put("En", "English");
		map3.put("Hi", "Hindi");
		map3.put("Ta", "tamil");
		map3.put("De", "German");
		map3.put("Fr", "French");
		System.out.println("entries of map"+map3);
		System.out.println("value for to key hi-"+map3.get("Hi"));
	}

}
