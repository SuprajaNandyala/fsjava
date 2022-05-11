/*Given an array arr of size N containing positive and negative integers. Arrange the array alternatively such that every non-negative integer is followed by a negative integer and vice-versa.
Input Format:
The first line contains an integer 'T' which denotes the number of test cases or queries to be run. Then, the T test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array (arr).

The second line contains 'N' single space-separated integers, representing the elements in the array.
Output Format:
For each test case, the output is “Valid” if the rearrangement is valid otherwise, “Invalid”, without quotes.
Sample Input 1:
1
4
-1 2 2 -5 
Sample Output 1:
-1 2 -5 2 */
import java.util.*;
public class Solution {
    
    public static void rearrange(int[] arr) {
        // Write you code here
	int n=arr.length;
		ArrayList<Integer> pos= new ArrayList();
        ArrayList<Integer> neg= new ArrayList();
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				pos.add(arr[i]);
			}
			else if(arr[i]<0)
			{
				neg.add(arr[i]);
			}
		}
		int p=0,ne=0;
		int ind=0;
		while(p<pos.size() && ne<neg.size()){
			if(ind%2==0){
				arr[ind]=pos.get(p);
			    p++;
			}
			else{
				arr[ind]=neg.get(ne);
				ne++;
			}
			ind++;
		}
		while (p<pos.size()) 
        {
            arr[ind] = pos.get(p);
            p++;
            ind++;
        }
        while (ne<neg.size()) 
        {
            arr[ind] = neg.get(ne);
            ne++;
		    ind++;
        }
    }
}
