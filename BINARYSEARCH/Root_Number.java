// Nth root of a number M is defined as a number X when raised to the power N equals to M.

// Approach: In order to find the Nth root of any given integer we are gonna use Binary Search.

// Step 1: Take low and high. Low will be equal to 1 and high will be M. 
//     We will take the mid of low and high such that the searching space is reduced using 
//     low + high / 2.
// Step 2: Make a separate function to multiply mid N times.
// Step 3: Run the while loop till (high – low > eps). 
//     Take eps as 1e-6, since we have to find answers to 6 decimal places.
// Step 4:  If the mid is less than M, then we will reduce search space to low and mid. 
//     Else, if it is greater than M then search space will be reduced to mid and high.
// Step 5: After the loop breaks we will have our answer as low or high.

// We have to find the answer to 6 decimals. So, we will have a double 1e-6. 
// We will run the while loop till (high – low > eps). 
// When we will come out of the loop we will have the answer which will be equal to low as well as high.
// Time Complexity -> N x log(M x 10^d)
// N - Multplication Loop
// Space Complexity -> O(1)

package BINARYSEARCH;

import java.lang.Math;

public class Root_Number {
    private static double multiply(double number, int n){
        double ans = 1.0;
        for (int i = 1; i <= n; i++){
            ans = ans * number;
        }
        return ans;
    }

    public static void getNthRoot(int n, int m){
        double low = 1;
        double high = m;
        double eps = 1e-7;

        while ((high - low) > eps){
            double mid = (high + low) / 2.0;
            if (multiply(mid,n) < m){
                low = mid;
            }else{
                high = mid;
            }
        }
        System.out.println(Math.round(low));
    }
    public static void main(String[] args){
        int n = 3, m = 27;
        System.out.println((1+16)/2.0);
        getNthRoot(n,m);
    }
    
}

// class Solution {
//     public int mySqrt(int x) {
//         if(x == 1) return 1;
//         int low = 0;
//         int high = x;
//         while(low < high - 1){  
//             int mid = low + (high - l) / 2;
//             if(mid == x / mid) return mid; // prevent from mid * mid overflow
//             else if(mid > x / mid) high = mid;  // prevent from mid * mid overflow
//             else low = mid; 
//         }
//         return l;
//     }
// }
