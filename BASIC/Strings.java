public class Strings {
        public static void main(String[] args) {
          
        // create strings
        String third = "JavaScript";
    
        // print strings
        System.out.println(third);   // print JavaScript

        // -------------------------- Java String Operations ---------------------------
        // -------------------------- 1. Get length of a String ------------------------

        String greet = "Hello! World";
        // get the length of greet
        int length = greet.length();
        System.out.println("Length: " + length);

        // -------------------------- 2. Join Two Java Strings ------------------------

        // create first string
        String first = "Java ";
        System.out.println("First String: " + first);

        // create second
        String second = "Programming";
        System.out.println("Second String: " + second);

        // join two strings
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);

        // --------------------------- 3. Compare two Strings --------------------------
        boolean result1 = first.equals(second);
        System.out.println("Strings first and second are not equal: " + result1);
    
        // compare first and third strings
        boolean result2 = first.equals(third);
        System.out.println("Strings first and third are not equal: " + result2);

        // --------------------- Escape character in Java Strings -----------------------
        // use the escape character
        String example = "This is the \"String\" class.";

        // --------------------- Java Strings are Immutable -----------------------------
        // In Java, strings are immutable. This means, once we create a string, we cannot change that string.
        // 1. JVM takes the first string "Hello! "
        // 2. creates a new string by adding "World" to the first string
        // 3. assign the new string "Hello! World" to the example variable
        // 4. the first string "Hello! " remains unchanged

        // create a string
        String example1 = "Hello! ";
        // add another string "World" to the previous tring example
        example1 = example1.concat(" World");

        // --------------------- Creating strings using the new keyword -----------------

        // create a string using new
        String name = new String("Java String");
        System.out.println(name);  
        
      }  
}

// ------------------------------ Methods ----------------------------------
// Methods Description
// contains()  -> checks whether the string contains a substring
// isEmpty()   -> checks whether a string is empty of not
// split()	   -> breaks the string into an array of strings

// substring()	-> returns the substring of the string
// join()       -> join the given strings using the delimiter
// charAt()     -> returns the character present in the specified location
// indexOf()    -> returns the position of the specified character in the string
// toLowerCase() -> converts the string to lowercase
// toUpperCase() -> converts the string to uppercase
// valueOf() -> returns the string representation of the specified argument






