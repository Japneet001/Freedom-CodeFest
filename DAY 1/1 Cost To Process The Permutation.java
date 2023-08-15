/*  Given an permutation of array 'ARR' of 'N' integers from 1 to 'N', your task is to find the cost needed to process all the array elements.
    You have to start processing the elements from the array position having integer 1, and then you can process the position of element 2 and then 3 and so on till 'N'.
    The cost to process the element at 'I' is |I-J|. The overall cost is the sum of all process costs. the initial cost for processing the first element is zero.
*/

// Time Complexity: O(n^2)

import java.util.*;
import java.io.*;

public class Solution {

    public static int costToProcess(int n, int[] arr) {
        int i = 0;
        int cost = 0;
        while (i < n) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i] + 1 || arr[j] == arr[i] - 1) {
                    cost += Math.abs(i - j);
                }
            }
            i++;
        }
        return cost;
        // Write your code here.
    }
}