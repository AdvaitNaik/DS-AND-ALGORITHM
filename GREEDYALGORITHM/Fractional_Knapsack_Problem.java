package GREEDYALGORITHM;

import java.util.*;

// Since it is possible to break the items as well we should focus on picking up items having higher (value/weight) first. 
// To achieve this, items should be sorted in decreasing order with respect to their (value /weight). 
// Once the items are sorted we can iterate. 
// Pick up items with weight lesser than or equal to the current capacity of the knapsack. 
// In the end, if the weight of an item becomes more than what we can carry, break the item into smaller units. 
// Calculate its value according to our current capacity and add this new value to our answer.

class Item{
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class itemComparator implements Comparator<Item>
{
    @Override
    public int compare(Item a, Item b) 
    {
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);
        if (r1 < r2) return 1;
        else if (r1 > r2) return -1;
        else return 0;
    }
}

public class Fractional_Knapsack_Problem {

    static double fractionalKnapsack(int W, Item arr[], int n){
        Arrays.sort(arr, new itemComparator());

        int currentWeight = 0;
        double finalvalue = 0.0;

        for(int i = 0; i < n; i++){
            if (currentWeight + arr[i].weight <= W){
                currentWeight += arr[i].weight;
                finalvalue += arr[i].value;
            }
            else{
                int remain = W - currentWeight;
                finalvalue += ((double)arr[i].value / (double)arr[i].weight) * (double)remain;
                break;

            }
        }
        return finalvalue;
    }
    public static void main(String args[])
    {
        int n = 3, weight = 50;
        Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};
        double ans = fractionalKnapsack(weight, arr, n);
        System.out.println("The maximum value is "+ans);
    }
    
}
