class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maximum = nums[0];
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > maximum) {maximum = sum;}
            if(sum < 0) {sum = 0;}
        }
        return maximum;
    }

    public static void main(String args[]) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        Solution sol = new Solution(); 
        int ans = sol.maxSubArray(num);
        System.out.println(ans);
    }
}