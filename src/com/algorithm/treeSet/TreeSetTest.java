package com.algorithm.treeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		SortedSet<Item> parts = new TreeSet<Item>();
//		NavigableSet<Item> parts1 =  new TreeSet<Item>();

		parts.add(new Item("kjmh", 1264));
		parts.add(new Item("asdc", 1234)); 
		
		parts.add(new Item("dddd", 1244));
		parts.add(new Item("nhgf", 1254));
		
		System.out.println(parts);
		
		SortedSet<Item> sortByDescprtion = new TreeSet<>(new Comparator<Item>() {
			public int compare(Item a, Item b) 
			{
				String descrA = a.getDescription();
				String descrB = b.getDescription();
				return descrA.compareTo(descrB);
			}
		});
		
		sortByDescprtion.addAll(parts);
		System.out.println(sortByDescprtion);
		

	}

}
