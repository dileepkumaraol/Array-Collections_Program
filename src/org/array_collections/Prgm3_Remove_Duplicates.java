package org.array_collections;

public class Prgm3_Remove_Duplicates {
	public static void main(String[] args) {
		
		int  a[]= {60,20,20,30,60,80,60,50,10};
		for(int i=0;i<a.length;i++){
		boolean duplicate = false;
		for(int j=i+1;j<a.length;j++){
		if(a[i] == a[j]){
		duplicate=true;}
		}
		if(duplicate==true)
		continue;
		System.out.print(" "+a[i]);
		}
	}
}
