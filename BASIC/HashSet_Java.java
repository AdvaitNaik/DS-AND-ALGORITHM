// Java code for initializing a Set
import java.util.*;
public class HashSet_Java {

	public static void main(String[] args)
	{
		// Create a set
		Set<Integer> set = new HashSet<Integer>(); ///////////// Declaration

		// Add some elements to the set
		set.add(1);
        set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);

		// Adding a duplicate element has no effect
		set.add(3);
		System.out.println(set);
	}
}

// METHODS

// add(element) -> This method is used to add a specific element to the set. 
//                 The function adds the element only if the specified element is not already present in the set else the function 
//                 returns False if the element is already present in the Set.

// clear()	->  This method is used to remove all the elements from the set but not delete the set. The reference for the set still exists.
                
// contains(element) ->  This method is used to check whether a specific element is present in the Set or not.

// isEmpty() -> This method is used to check whether the set is empty or not.

// iterator() -> This method is used to return the iterator of the set. The elements from the set are returned in a random order.

// remove(element) -> This method is used to remove the given element from the set. 
//                    This method returns True if the specified element is present in the Set otherwise it returns False.

// size() -> This method is used to get the size of the set. This returns an integer value which signifies the number of elements.
