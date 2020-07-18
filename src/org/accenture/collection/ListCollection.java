package org.accenture.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		List <Integer> li = new ArrayList <Integer> ();
			li.add(10);
			li.add(20);
			li.add(2, 30);
			li.add(40);
			
			
			List <Integer> newli = new LinkedList<Integer>();
			System.out.println("New List : " +newli);
			boolean empty = newli.isEmpty();
			System.out.println("newli list is empty : " +empty);
			
			boolean addAll = newli.addAll(li);
			System.out.println("List copied from li collection object : " +addAll);
			newli.add(50);
			newli.add(60);
			newli.add(70);
			System.out.println(newli);
			
			boolean removeAll2 = newli.removeAll(li);
			System.out.println("Removed common values : " +removeAll2);
			System.out.println(newli);
			
			boolean retainAll = newli.retainAll(li);
			System.out.println("Retained : " +retainAll);
			System.out.println(newli);
			
			
			int size = li.size();
			System.out.println("Array List size is : " +size);
			
			int indexOf = li.indexOf(20);
			System.out.println("IndexOf 20 is : " +indexOf);
			
			int lastIndexOf = li.lastIndexOf(40);
			System.out.println("Last IndexOf : " +lastIndexOf);
			
			Integer set = li.set(0, 4000);
			System.out.println(li);
			
			Integer indexPosition = li.get(0);
			System.out.println(indexPosition);
			
			boolean contains = li.contains(20);
			System.out.println("20 is available in the list : " +contains);
			
			Integer remove = li.remove(0);
			System.out.println(li);
			
			boolean removeAll = li.removeAll(li);
			System.out.println(removeAll);
			System.out.println(li);
				
			}
		}
	


