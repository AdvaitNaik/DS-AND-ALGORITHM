package GREEDYALGORITHM;

import java.util.ArrayList;
import java.util.*;

// Approach: We will keep a pointer at the end of the array i. 
// Now while(V >= coins[i]) we will reduce V by coins[i] and add it to the ans array.

// We will also ignore the coins which are greater than V and the coins which are less than V. 
// We consider them and reduce the value of V by coins[i].

// PROBLEM - Whem sum of two coins is greater than third in coins array

// Time Complexity -> O(V)
// Space Complexity -> O(1)

class Minimum_Number_Coin{
    public static void main(String[] args){
        int V = 49;
        ArrayList<Integer> ans = new ArrayList<>();
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n = coins.length;
        for (int i = n-1; i >= 0; i--){
            while(V>=coins[i]){
                V -= coins[i];
                ans.add(coins[i]);
            }
        }
        System.out.println("The minimum number of coins is "+ans.size());
        System.out.println("The coins are ");
        for (int i = 0; i < ans.size(); i++) {
          System.out.print(" " + ans.get(i));
        }
        
    }

}