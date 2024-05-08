package org.array_collections;

import java.util.ArrayList;
import java.util.List;

public class Prgm5_ArrayList{
		
		public static void main(String[] args) {
			List<Integer> l=new ArrayList<>();
			l.add(10);
			l.add(20);
			l.add(30);
			l.add(90);
			l.add(10);
			l.add(10);
			l.add(40);
			l.add(50);
			
			int size = l.size();
			System.out.println("List Array size is "+size);
			
			int indexOf = l.indexOf(10);
			System.out.println("Index of 10: "+indexOf);
			
			int lastIndexOf = l.lastIndexOf(10);
			System.out.println("Last Index is: "+lastIndexOf);
			
			int indexOf2 = l.indexOf(50);
			System.out.println("Index of 50: "+indexOf2);
			
			int indexOf3 = l.indexOf(90);
			System.out.println("Index of 90: "+indexOf3);
			
			int indexOf4 = l.indexOf(70);
			System.out.println(indexOf4);
			
			Integer i1 = l.get(0);
			Integer i2 = l.get(4);
			Integer i3 = l.get(5);
			System.out.println(i1+" "+i2+" "+i3);
			
		}
		
	
}
