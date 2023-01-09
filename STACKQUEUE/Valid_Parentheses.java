// Intuition:  We have to keep track of previous as well as most recent opening brackets and 
// also keep in mind the sequence, as after opening of the bracket there should be opposite pairs of brackets. 
// Also handle the corner cases like [ ) ( ] where closing bracket occurs first and opening bracket after 
// it, which is an invalid sequence, as well as [ ( ] ) where the most recent opening didn’t get its 
// opposite pair hence it will also not be valid.

// So we have to use a data structure that will keep track of first in and last out, 
// hence we will use the stack.

// Approach: 
// 1. Whenever we get the opening bracket we will push it into the stack. I.e ‘{‘, ’[’, ’(‘.
// 2. Whenever we get the closing bracket we will check if the stack is non-empty or not.
// 3. If the stack is empty we will return false, else if it is nonempty then we will check if 
//      the topmost element of the stack is the opposite pair of the closing bracket or not.
// 4. If it is not the opposite pair of the closing bracket then return false, else move ahead.
// 5. After we move out of the string the stack has to be empty if it is non-empty then 
//      return it as invalid else it is a valid string.

// Time Complexity -> O(N)
// Space Complexity -> O(N)

package STACKQUEUE;
import java.util.*;

class Validation{
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()){
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}

public class Valid_Parentheses {
    public static void main(String args[]) {
        String s="()[{}()]";
        Validation v = new Validation();
        if (v.isValid(s) == true)
        System.out.println("True");
		else
		System.out.println("False");
    }
}


// https://stackoverflow.com/questions/38883210/is-it-a-good-practice-to-put-string-tochararray-into-for-loop

// L1: L2: ... Lm:
// for ({VariableModifier} TargetType Identifier : Expression) {
//   Statement
// }
// is equivalent to the following basic for statement:

// T[] #a = Expression;
// L1: L2: ... Lm:
// for (int #i = 0; #i < #a.length; #i++) {
//     {VariableModifier} TargetType Identifier = #a[#i];
//     Statement
// }
// So:

// for (char c : s.toCharArray()) {
//   // ...
// }
// is equivalent to:

// T[] cs = s.toCharArray();
// for (int i = 0; i < cs.length; i++) {
//     char c = cs[i];
//     // ...
// }
// So the s.toCharArray() is executed only once.

// However, in

// for (int i = 0; i < s.toCharArray().length; i++) {
// the s.toCharArray() is executed before every iteration of the loop. This is not desirable, since it creates a new array of length s.length(), copies the chars into that array, then takes the length of the array and discards the data.

// Since the loop executes s.length() times, this loop is then at least quadratic in the string length.

// It's much computationally cheaper to use:

// for (int i = 0; i < s.length(); i++) {
// which is linear in the string length.

