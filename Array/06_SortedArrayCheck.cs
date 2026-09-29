/*

Check if Array is Sorted

Problem Statement: Given an integer array, check whether the array is sorted in increasing order or not.

Example 1:
Input: arr = [10, 20, 30, 40, 50]
Output: Yes

Example 2:
Input: arr = [10, 20, 15, 40, 50]
Output: No

*/



using System;

namespace HelloWorld
{
	public class Program
	{
	    static bool IsSorted(int[] arr){
	        for(int i=1;i<arr.Length;i++){
	            if(arr[i] < arr[i-1]){
	                return false;
	            }
	        }
	        
	        return true;
	    }
		public static void Main(string[] args)
		{
			int[] arr = {10,20,30,40,50};
			int[] arr1 = {10,12,24,13,34};
			
			if(IsSorted(arr1)){
			    Console.WriteLine("yes");
			}else{
			    Console.WriteLine("no");
			}
			
		}
	}
}
