/*  Given an permutation of array 'ARR' of 'N' integers from 1 to 'N', your task is to find the cost needed to process all the array elements.
    You have to start processing the elements from the array position having integer 1, and then you can process the position of element 2 and then 3 and so on till 'N'.
    The cost to process the element at 'I' is |I-J|. The overall cost is the sum of all process costs. the initial cost for processing the first element is zero.
*/

// Time Complexity: O(n)

import java.util.*;
import java.io.*;

public class Solution {

    public static int costToProcess(int n, int[] arr) {
        int cost = 0;
        int pos[] = new int[n];
        for (int i = 0; i < n; i++) {
            pos[arr[i] - 1] = i;
        }
        int j = 0;
        int k = 1;
        for (int i = 0; i < n - 1; i++) {
            cost += Math.abs(pos[i] - pos[i + 1]);
        }
        return cost;
        // Write your code here.
    }
}