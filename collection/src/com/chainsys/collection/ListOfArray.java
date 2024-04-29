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

		}

	}


