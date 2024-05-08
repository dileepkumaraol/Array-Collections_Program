package org.array_collections;

import java.util.ArrayList;
import java.util.List;

public class Prgm10_common_Values {
	public static void main(String[] args) {
		List<Integer> l3 = new ArrayList<>();
	
		l3.add(10);
		l3.add(20);
		l3.add(30);
		l3.add(90);
		l3.add(10);
		l3.add(40);
		l3.add(50);
		
		
		
		List<Integer> l4 = new ArrayList<>();
		
		l4.addAll(l3);
		System.out.println(l4);

		l4.add(30);
		l4.add(40);
		l4.add(50);
		l4.add(60);
		l4.add(80);
		System.out.println(l4);
		
		//Create a new ArrayListlists with values and return the common values
		l4.retainAll(l3);
		System.out.println(l4);
		
		System.out.println();
		//10,20,30,90,10,10,40,50
		List<Integer> l5 = new ArrayList<>();
		l5.add(10);
		l5.add(20);
		l5.add(30);
		l5.add(40);
		l5.add(50);
		l5.add(60);
		l5.add(70);
		l5.add(80);
		
		System.out.println();
		//10,20,60,50,40,70,80,90
		List<Integer> l6 = new ArrayList<>();
		l6.add(100);
		l6.add(200);
		l6.add(300);
		l6.add(400);
		l6.add(500);
		l6.add(600);
		l6.add(700);
		l6.add(800);
		
		l6.retainAll(l5);
		System.out.println(l6);
	}
}
