package com.chainsys.collection;

import java.util.*;

public class List {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			alist.add(i);
		}
		alist.add(100);
		alist.add(100);
		alist.add(100);
		
		System.out.println("The Value is:" + alist);
		System.out.println("The get value is:" + alist.get(4));
		

		System.out.println("The Updated list is" + alist.set(0, 21));

		System.out.println("The Removed value :" + alist.remove(1));

		System.out.println("The boolean :" + alist.contains(3));
		System.out.println(alist);
		
		for(int j:alist) {
			System.out.println(j);
		}
		Iterator<Integer> i=alist.iterator();
		System.out.println();
		
		//System.out.println("The Specific Value is:"+i.next());
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("Jhon");
		slist.add("2");
		slist.add("l");
		slist.add("ok");
		System.out.println("The value is :" + slist);
		slist.contains(slist);
		
		//LinkedList<Integer> blist=new LinkedList<Integer>();
//
	//	blist.
	}

}
