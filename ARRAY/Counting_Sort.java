class Solution {
    public int countKDifference(int[] nums, int k) {
        int res = 0;
        int[] counts = new int[101];
        for(int i=0;i<nums.length;i++){
            counts[nums[i]]++;
        }
        for(int i=counts.length-1;i>=k;i--){
            if(counts[i]>0 && counts[i-k]>0){
                res+=counts[i]*counts[i-k];
            }
        }
        return res;
    }
}

// Link - https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/