package prob2;

import javax.management.loading.PrivateClassLoader;

/**
 * Implement the add, remove, and toString methods of this class 
 *
 */
public class MyArrayList {
	//DO NOT MODIFY THIS LINE OF CODE
	private String[] arr = new String[8];
	private int nextPosition = 0;
	
	//Adds String s to the end of the list
	public void add(String s) {
		//implement
		if(s == null || s == "")
			return;
		
		if(arr.length == nextPosition) {
			expandTheArray();
		}
		
		arr[nextPosition++] = s;		
	}
	
	public void expandTheArray() {
		String[] newArray = new String[arr.length * 2];
		
		for(int i = 0; i < arr.length; i++)
			newArray[i] = arr[i];
		
		arr = newArray;		
	}
	
	//Removes and returns the String that is in position k in the list
	public String remove(int k) {
		//implement
		if(k < 0 || k > nextPosition - 1)
			return null;
		
		String returnString = arr[k];
		
		for(int i = k; i < nextPosition; i++) {
			arr[i] = arr[i+1];
		}
		nextPosition--;
		return returnString;
	}
	
	//Returns a string representation of this list
	//Example: After you add Strings 
	//    Bob
	//    Steve
	//    John
	//to an initially empty list, the output of the toString() method
	//should be:
	//   [Bob, Steve, John]
	public String toString() {
		//implement
		String outputString = "[";
		for(int i = 0; i < nextPosition; i++) {
			if(i == nextPosition - 1)
				outputString += arr[i];
			else
				outputString += arr[i] + ", ";
		}
		outputString += "]";
		return outputString;
	}
	
	//Test your code using this main method 
	public static void main(String[] args) {
		testZeroElements();
		testAdd();
		testRemoveFromEnd();
		testRemoveFromFront();
		testRemoveFromMiddle();
		testResize();
	}
	
	//expected output:  []
	public static void testZeroElements() {
		MyArrayList list = new MyArrayList();
		System.out.println(list);
	}
	
	//expected output: [Joe, Bob, Steve]
	public static void testAdd() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		System.out.println(list);
	}
	//expected output [Joe, Bob]
	public static void testRemoveFromEnd() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		list.remove(2);
		System.out.println(list);
	}
	//expected output: [Bob, Steve]
	public static void testRemoveFromFront() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		list.remove(0);
		System.out.println(list);
	}
	//expected output:  [Joe, Steve]
	public static void testRemoveFromMiddle() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		list.remove(1);
		System.out.println(list);
	}
	
	//expected: no exception is thrown
	public static void testResize() {
		MyArrayList list = new MyArrayList();
		try {
			list.add("Joe");
			list.add("Bob");
			list.add("Steve");
			list.add("Joey");
			list.add("Bobby");
			list.add("Stevie");
			list.add("Tony");
			list.add("Tom");
			list.add("Tania");
			list.add("Dave");
			list.add("Dick");
			list.add("Rich");
			System.out.println(list);
		} catch(Exception e) {
			System.out.println("Exception trying to add 12 Strings to the list: " 
					+ e.getClass().getSimpleName());
		}	
	}
}
