package com.org.tav.day3;

public class compareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d="football";
		String e="football";
		//reference points to impression available in scp
		
		String f=new String("football");
		String g=new String("football");
		//create obj in heap and an impression in scp[stirng constant pool]
		
		String m="mumbai";
		String m1="mumbai";
		String r="ranchi";
		String p="pune";
		String n="";
		System.out.println(m.compareTo(m1));//m==m1 0
		System.out.println(m.compareTo(r));//m<r -ve value
		System.out.println(m.compareTo(p));//returns integer
		System.out.println(r.compareTo(p));//r>p +ve value
		System.out.println(p.compareTo(n));
		
	
}
}
