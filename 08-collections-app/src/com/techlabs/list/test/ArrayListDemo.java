package com.techlabs.list.test;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();
		System.out.println(list);
		System.out.println(list.size());
		
		list.add("chirag");
		list.add("devan");
		
		System.out.println(list);
		
		list.add(1, "suyash");
		System.out.println(list);
		
		list.add(3, "pranay");
		System.out.println(list);
		
		list.add(50);
		
		System.out.println(list);
		
		list.remove("suyash");
		
		System.out.println(list);
		
	

	}

}
