// # Naive Method
// ## Time Complexity -> O(nlogn)
// ## Sort -> Merge Sort O(logn)
// ## Space Compplexity -> O(1)


// ## Hashing
// ## Time Complexity -> O(n)
// ## Space Compplexity -> O(n)

// # Circular Array
// ## Time Complexity -> O(n)
// ## Space Compplexity -> O(1)

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String args[]) {
        int[] num = {2,5,9,6,9,3,8,9,7,1};
        Solution sol = new Solution(); 
        int ans = sol.findDuplicate(num);
        System.out.println(ans);


    }
}