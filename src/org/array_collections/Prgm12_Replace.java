package org.array_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prgm12_Replace {
public static void main(String[] args) {
	
	List<Integer> l1 = new ArrayList<>();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	l1.add(400);
	l1.add(500);
	l1.add(600);
	l1.add(700);
	System.out.println("Actual Value: "+l1);
	
	//Replace the value 300 into 350 in the list
	l1.set(2, 350);
	System.out.println("Replacing 300 to 350 : "+l1);
	
	//10,20,30,90,10,10,40,50,10
	List<Integer> l2 = new ArrayList<>();
	l2.add(10);
	l2.add(20);
	l2.add(30);
	l2.add(90);
	l2.add(10);
	l2.add(10);
	l2.add(40);
	l2.add(50);
	l2.add(10);
	
	System.out.println("Actual Value: "+l2);
	
	//Replace the value present in 7th index as 90 
	l2.set(7, 90);
	System.out.println("Replacing 50 to 90 : "+l2);
	
	//Replace the 10 into 100 in List
	Collections.replaceAll(l2,10,100);
	System.out.println("Replace the 10 into 100 in List: "+l2);
	
}
}
