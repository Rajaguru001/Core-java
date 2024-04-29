package com.chainsys.collection;

import java.util.*;

public class ListOfArray {
	public static void main(String[] args) {
		LinkedList<Integer> blist = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		LinkedList q = new LinkedList();

		for (int i = 1; i <= 10; i++) {

			blist.add(i);
		}

		System.out.println("The Value is" + blist);
		for (int j : blist) {
			System.out.println( j);
		}

			blist.addFirst(10);
			blist.addLast(1);
			System.out.println("The Array" + blist);
			LinkedList seclist = new LinkedList();
			seclist = (LinkedList) blist.clone();
			System.out.println("The peek value:" + blist.peek());

			System.out.println("The Clone Array" + seclist);
			
			Queue<Integer> q1 =new LinkedList(); 
			
			q.add(10);
			q.add(2);
			q.add(5);
			q.add(11);
			//queue6y
			System.out.println("poll"+q.size());
		System.out.println("Head is "+q.peek());
		System.out.println("Remove"+q.remove());
		
	
		PriorityQueue <Integer>q2=new PriorityQueue<Integer>();
		
		q2.add(9);
		q2.add(8);
		q2.add(1);
		q2.add(2);
		System.out.println(q2);
		System.out.println("the Size:"+q2.size());
		System.out.println("The poll: "+q2.poll());	
		
		HashSet<String>hs=new HashSet<String>();
		hs.add("Raja");
		hs.add("Guru");
		hs.add("Vasa");
		hs.add("suusa");
		hs.add("Raja");
		System.out.println("The set is: "+hs);
		
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("Raja");
		ts.add("Guru");
		ts.add("Vasa");
		ts.add("suusa");
		ts.add("Raja");
		
		System.out.println("The Tree Set is: "+ts);
		
		Map <Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Raja");
		hm.put(2, "Guru");
		hm.put(3, "Vasa");
		hm.put(4, "Chand");
		hm.put(5, "Prane");
		System.out.println(hm);
		System.out.println(hm.containsKey(1));
		System.out.println("Size Of the Map is");
		System.out.println(hm.size());
		
		
		
		
	
		

		}

	}


