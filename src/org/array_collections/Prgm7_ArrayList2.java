package org.array_collections;

import java.util.ArrayList;
import java.util.List;

public class Prgm7_ArrayList2 {
public static void main(String[] args) {
List<Integer> l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
l.add(50);
l.add(60);
Integer i1 = l.get(1);
System.out.println("The Second value of Index is "+i1);

List<Integer> l1=new ArrayList<>();
l1.add(100);
l1.add(200);
l1.add(300);
l1.add(400);
l1.add(500);
l1.add(600);
l1.add(700);

Integer i2 = l1.get(4);
System.out.println("The Fouth Value of Index is "+i2);

List<Integer> l2=new ArrayList<>();
l2.add(105);
l2.add(205);
l2.add(305);
l2.add(405);
l2.add(505);
l2.add(605);
l2.add(705);
l2.add(805);
Integer i3 = l2.get(7);
System.out.println("The Eight position of Index: "+i3);

System.out.println("Normal For Loop");
for (int i = 0; i < l2.size(); i++) {
	System.out.println(l2.get(i));
	
}

System.out.println("Enhanced For Loop");
for (Integer l3 : l2) {
	System.out.println(l3);
}

}
}
