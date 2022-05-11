/* 
Problem Statement
You have been given two arrays/list ‘ARR1’ and ‘ARR2’ consisting of ‘N’ and ‘M’ integers respectively. Your task is to return the number of elements common to ‘ARR1’ and ‘ARR2’ and the number of elements in the union of ‘ARR1’ and ‘ARR2’.
Input Format:
The first line contains a single integer ‘T’ representing the number of test cases.

The first line of each test case contains two single space-separated integers ‘N' and ‘M’ representing the size of the array/list ‘ARR1’ and ‘ARR2’ respectively.

The second line of input of each test case contains ‘N’ single space-separated integers representing the array/list elements of ‘ARR1’.

The third line and the last line of input of each test contains ‘M’ single space-separated integers representing the array/list elements of ‘ARR2’.
Output Format:
For each test case, return the number of elements common to ‘ARR1’ and ‘ARR2’ and the number of distinct elements in the union of ‘ARR1’ and ‘ARR2’. 
*/
import java.util.ArrayList;

public class Solution {
	
	public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
	
		arr1.retainAll(arr2);
		int c=arr1.size();
		ArrayList<Integer> res=new ArrayList<>();
		res.add(c);
		res.add((n+m-c));
		return res;
	}
}
