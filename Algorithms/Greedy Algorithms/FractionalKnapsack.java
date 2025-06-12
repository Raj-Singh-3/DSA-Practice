// https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
// Given two arrays, val[] and wt[], representing the values and weights of items, and an integer capacity representing the maximum weight a knapsack can hold, determine the maximum total value that can be achieved by putting items in the knapsack. You are allowed to break items into fractions if necessary.
// Return the maximum value as a double, rounded to 6 decimal places.



// Approach:
// Here the main logic is to sort the array on the basis of values/weights in descending order.

import java.util.ArrayList;

public class FractionalKnapsack {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        ArrayList<double[]> arr = new ArrayList<>();
        int n = values.length;
        for(int i = 0;i<n;i++)
        {
            double temp[] = new double[3];
            temp[0] = values[i];
            temp[1] = weights[i];
            temp[2] = (double)values[i]/weights[i];
            arr.add(temp);
        }
        arr.sort((a,b)->Double.compare(b[2], a[2])); // descending order

        double totalValues = 0;
        for (int i = 0; i < n; i++) {
            if(W>=arr.get(i)[1])
            {
                totalValues += arr.get(i)[0];
                W -= arr.get(i)[1];
        
            }
            else
            {
                totalValues += arr.get(i)[2] * W;
                break;
            }
        }
        return totalValues;
    }
}
