/*Problem Statement
You are given an array 'nums' consisting of first N positive integers. But from the N integers, one of the integers occurs twice in the array, and one of the integers is missing. You need to determine the repeating and the missing integer.
Input Format:
The very first line of input contains an integer ‘T’ denoting the number of test cases. 

The first line of every test case contains an integer ‘N’ denoting the number of elements present in the array.

The second line of every test case contains ‘N’ space-separated integers denoting the elements present in the array.
Output Format:
For each test case, print the two space-separated integers denoting the repeating and the missing numbers, in the same order.
*/
public class Solution 
{
    public static int[] findRepeatingAndMissingNumbers(int[] nums) 
    {
    	// Write your code here
		int n1=0,n2=0;
		int n=nums.length;
		int[] count=new int[n+1];
		int[] ans=new int[2];
		for (int i=0;i<n;i++) 
        {
            count[nums[i]]++;
        }
		for (int i=1;i<= n;i++) 
        {
            if (count[i] == 0) 
            {
                 n1=i;
            }
            else if (count[i] == 2) 
            {
                n2=i;
            }
        }
			ans[0]=n2;
			ans[1]=n1;
		return ans;
    }
}
