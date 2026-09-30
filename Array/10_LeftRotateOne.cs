/*

Left Rotate Array by One

Problem Statement:
Given an integer array, left rotate the array by one position. The first element should be moved to the last position, while the order of the remaining elements stays the same.

Example 1:
Input: arr = [1, 2, 3, 4, 5]
Output: [2, 3, 4, 5, 1]

Example 2:
Input: arr = [10, 20, 30, 40]
Output: [20, 30, 40, 10]

*/


using System;

namespace HelloWorld
{
	public class Program
	{
	    static void LeftRotateOne(int[] arr)
	    {
	        int temp = arr[0];
	        
	        for(int i=1; i<arr.Length;i++)
	        {
	            arr[i-1] = arr[i];
	        }
	        
	        arr[arr.Length-1] = temp;
	    }
	    
		public static void Main(string[] args)
		{
		    int[] arr = {1, 2, 3, 4, 5};
		    
		    LeftRotateOne(arr);
		    
		    foreach(int element in arr)
		    {
		        Console.Write(element+" ");
		    }
		    
			Console.WriteLine();
		}
	}
}
