package RECURSION;
import java.util.*;

/////////// Brute Force //////////
// At every index, we make a decision whether to pick or not pick the element at that index. 
// This will help us in generating all possible combinations but does not take care of the duplicates. 
// Hence we will use a set to store all the combinations that will discard the duplicates.

// Time Complexity -> O(2^n * (klog(x))). 
// 2^n for generating every subset and k*log(x) to insert every combination of average length k in a set of size x. 
// After this, we have to convert the set of combinations back into a list of list /vector of vectors which takes more time.

// Space Complexity ->  O(2^n * k) to store every subset of average length k. 
// Since we are initially using a set to store the answer another O(2^n *k) is also used.

/////////// Recursion //////////
// 1. Sort the input array.
// 2. Make a recursive function that takes the input array, the current subset, the current index and 
//     a list of list/vector of vectors to contain the answer.
// 3. Try to make a subset of size n during the nth recursion call and consider elements from every index while 
//     generating the combinations. 
// 4. Only pick up elements that are appearing for the first time during a recursion call to avoid duplicates.
// 5. Once an element is picked up, move to the next index.
// 6. The recursion will terminate when the end of array is reached.
// 7. While returning backtrack by removing the last element that was inserted.

// Time Complexity -> O(2^n) for generating every subset and O(k) to insert every subset in another data structure 
//                    if the average length of every subset is k. Overall O(k * 2^n).
// Space Complexity -> O(2^n * k) to store every subset of average length k. 
//                     Auxiliary space is O(n)  if n is the depth of the recursion tree.

public class Subset_Sum_Unique_Index {
    public static void findSubsets(int index, int[] nums, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds));
        for (int i = index; i < nums.length; i++){
            if (i != index && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            findSubsets(i+1, nums, ds, ansList);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDuplicate(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList =  new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ansList);
        return ansList;
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 2};
        List<List<Integer>> ans = subsetsWithDuplicate(nums);
        System.out.print(ans);
    }
}
