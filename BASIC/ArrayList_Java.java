// Java program to demonstrate the working of ArrayList in Java

import java.io.*;
import java.util.*;

class ArrayList_Java {
	public static void main(String[] args)
	{

		// Declaring the ArrayList without mentioned its size
		ArrayList<Integer> arrli = new ArrayList<>(); ///////////////////// Declaration

		// Appending new elements at the end of the list
		for (int i = 1; i <= 5; i++)
			arrli.add(i);

		// Printing elements
		System.out.println(arrli);

		// Remove element at index 3
		arrli.remove(3);

		// Displaying the ArrayList after deletion
		System.out.println(arrli);

		// Printing elements one by one
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
}


// Important Features of ArrayList -

// 1. ArrayList inherits AbstractList class and implements the List interface.
// 2. ArrayList is initialized by size. 
//    However, the size is increased automatically if the collection grows or shrinks if the objects are removed from the collection.
// 3. Java ArrayList allows us to randomly access the list.
// 4. ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases.
// 5. ArrayList in Java can be seen as a vector in C++.
// 6. ArrayList is not Synchronized. Its equivalent synchronized class in Java is Vector.

// METHODS - 

// add(int index, Object element) -> This method is used to insert a specific element at a specific position index in a list.

// add(Object o) -> This method is used to append a specific element to the end of a list.

// clear()	This method is used to remove all the elements from any list.

// contains?(Object o)	-> Returns true if this list contains the specified element.

// get?(int index)	-> Returns the element at the specified position in this list.

// indexOf(Object O) ->  The index the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.

// isEmpty?() -> Returns true if this list contains no elements.

// size?() -> Returns the number of elements in this list.