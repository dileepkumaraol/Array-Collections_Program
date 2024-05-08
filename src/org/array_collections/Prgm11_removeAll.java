package org.array_collections;

import java.util.ArrayList;
import java.util.List;

public class Prgm11_removeAll {
	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		// 10,20,30,40,50,60,70,80
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		
		List<Integer> l2 = new ArrayList<>();
		//100,200,300,400,500,600,700,8000
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l2.add(500);
		l2.add(600);
		l2.add(700);
		l2.add(800);
		
		//Create a new ArrayListlists with values and perform removeAll() function
		l2.removeAll(l1);
		System.out.println(l2);
		
	}
}
