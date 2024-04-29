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
	
		

		}

	}


