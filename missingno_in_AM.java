/*
Problem Statement
You are given a sorted array of ‘N’ distinct integers that are in the Arithmetic Progression sequence except for one element which is missing from the sequence. You have to find that missing number from the given sequence.
Input Format:
The first line of the input contains an integer ‘T’ denoting the number of test cases.

The first line of each test case contains a single positive integer ‘N’ denoting the number of the elements present in the sequence. 

The second line of each test case contains ‘N’ space-separated integers.
Output Format:
The only line of output of each test case should contain an integer denoting the missing element in the given sequence.

Print the output of each test case in a separate line.
Sample Input 1:
2
3
1 4 10
4
5 10 20 25 
Sample Output 1:
 7
 15
 */
 public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
        // Write your code here
		int diff=(arr[n-1]-arr[0])/n;
        int ans=0;
        for (int i=0;i+1<n;++i) 
        {
            int diff2=arr[i+1]-arr[i];
            if (diff2!=diff) 
            {
                ans= arr[i]+diff;
            }
        }
        return ans;
    }
}
