package RECURSION;
import java.util.*;

// Solution 1 - Brute Force Solution
// Time complexity -> O(N! * N) +O(N! Log N!)
// Reason:  The recursion takes O(N!) time because we generate every possible permutation and another O(N)  
// time is required to make a deep copy and store every sequence in the data structure. 
// Also, O(N! Log N!)  time required to sort the data structure

// Space complexity -> O(N) 
// Reason: Result stored in a vector, we are auxiliary space taken by recursion

// Solution 2 - Optimal Approach
// Since this is a permutation we can assume that there are four positions that need to be filled 
// using the four numbers of the sequence. 
// First, we need to decide which number is to be placed at the first index. 
// Once the number at the first index is decided we have three more positions and three more numbers.  
// Now the problem is shorter. 
// We can repeat the technique that was used previously until all the positions are filled. 
// The technique is explained below.

public class Kth_Permutation_Sequence {
    static String getPermutation(int n, int k){
        int fact = 1;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++){
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";
        k = k - 1;
        while(true){
            ans = ans + "" + numbers.get(k/fact);
            numbers.remove(k/fact);
            if (numbers.size() == 0){
                break;
            }
            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }


    public static void main(String args[]){
        int n = 3, k = 3;
        String ans = getPermutation(n, k);
        System.out.println("The K-th permutation sequence" + ans);
    }
}
