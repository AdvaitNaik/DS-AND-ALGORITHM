// Intuition - The main idea is that on every index you have two options either to select the element 
// to add it to your subset(pick) or not select the element at that index and move to the next index(non-pick).

// Approach - Traverse through the array and for each index solve for two arrays, one where you pick the element,
// i.e add the element to the sum or don’t pick and move to the next element, recursively, until the base condition. 
// Here when you reach the end of the array is the base condition.

// Time Complexity -> O(2^n)+O(2^n log(2^n)). 
// Each index has two ways. You can either pick it up or not pick it. 
// So for n index time complexity for O(2^n) and for sorting it will take (2^n log(2^n)).

// Space Complexity -> O(2^n) for storing subset sums, since 2^n subsets can be generated for an array of size n.

package RECURSION;
import java.util.*;

public class Subset_Sum_Pick_Not_Pick {
    static void subsetSumHelper(int index, int sum, ArrayList<Integer>arr, int N, ArrayList<Integer> sumSubset){
        if (index == N){
            sumSubset.add(sum);
            return;
        }
        // PICK
        subsetSumHelper(index+1, sum+arr.get(index), arr, N, sumSubset);
        // NOT-PICK
        subsetSumHelper(index+1, sum, arr, N, sumSubset);
    }


    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList <Integer> sumSubset = new ArrayList <>();
        subsetSumHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
     }

    public static void main(String args[]) {

        ArrayList < Integer > arr = new ArrayList <> ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList <Integer> ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }
    
}