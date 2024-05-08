package org.array_collections;

import java.util.ArrayList;
import java.util.List;

public class Prgm8_List_remove {
	public static void main(String[] args) {
		// List = 10,20,30,40,50,60

		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(40);
		
		System.out.println("Before removing List: "+l1);
		
		//Remove the value present at 2nd index
		l1.remove(2);
		System.out.println("After removing List: "+l1);
		
		//Remove the value present at 10th index
		Integer remove = l1.remove(10);
		System.out.println("Remove the value present at 10th index "+remove);
		
		
	}
}
