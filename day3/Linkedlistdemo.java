package com.org.tav.day3;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		list.add("mumbai");list.add("delhi");list.add("bhopal");
		list.add("pune");list.add("patna");list.add(null);
		System.out.println("initial linkedlist="+list);
		list.addFirst("hyd");
		list.addLast("bang");
		System.out.println("modified linkedlist"+list);
		System.out.println(list.contains("hyd"));
		
		LinkedList<Integer> num=new LinkedList<>();
		for(int i=0;i<=20;i++)
		{
			if(i%2==0) {
				num.add(i);
			}
		}
		Object fnumber=num.getFirst();
		System.out.println("first even no"+fnumber);
		Object getw=num.get(4);
		System.out.println("no @4"+getw);
		
		System.out.println("------------");
		System.out.println(list.peekFirst());//shows 1st element but not removes 
		System.out.println(list.peekLast());//retrieves last element but not remove it
		System.out.println(list.pollFirst());//retrieves and removes first
		System.out.println(list.pollLast());//retrieves and removes last
		
		System.out.println(list.pop());
		list.push("hero");
		System.out.println(list);
	}

}
