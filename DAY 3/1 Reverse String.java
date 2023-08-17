/*  You are given a string 'S'. You are also given 'M' integers in an array 'A'. You perform 'M' operations on this string. The operations are given in an array 'A' of size 'M'. You perform the operations in the order they appear in the array 'A'. In the 'i'th operation, you reverse the substring of 'S' from the position 'A[i]' to 'len(S)' - 'A[]' -1 (0 based). Your task is to find the string after performing all the operations. 
*/

import java.util.* ;
import java.io.*; 
public class Solution {
    static String reverseString(String s, int m, ArrayList<Integer> a) {
        // Write your code here
        int n = s.length();
        int[] reverseCounts = new int[n]; // Array to keep track of how many times each index is reversed
        
        for (int i = 0; i < m; i++) {
            int startIndex = a.get(i);
            int endIndex = n - a.get(i) - 1;
            reverseCounts[startIndex]++;
            if (endIndex + 1 < n) { // Ensure not to go out of bounds
                reverseCounts[endIndex + 1]--;
            }
        }
        
        StringBuilder result = new StringBuilder();
        int reverseCount = 0;
        
        for (int i = 0; i < n; i++) {
            reverseCount += reverseCounts[i];
            if (reverseCount % 2 == 0) {
                result.append(s.charAt(i));
            } else {
                int endIndex = n - i - 1;
                result.append(s.charAt(endIndex));
            }
        }
        
        return result.toString();
    }
}
