/*

Leaders in an Array

Problem Statement:
Given an integer array, find all the leaders in the array. An element is called a leader if it is greater than all the elements to its right. The last element is always a leader.

Example 1:
Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]

Example 2:
Input: arr = [7, 10, 4, 10, 6, 5, 2]
Output: [10, 10, 6, 5, 2]

*/


using System;

namespace HelloWorld
{
	public class Program
	{
	    
	    static void Leader(int[] arr)
	    {
	        int CurrentLeader = arr[arr.Length-1];
	        Console.Write(CurrentLeader+" ");
	        
	        for(int i=arr.Length-2; i>=0; i--)
	        {
	            if(CurrentLeader<arr[i])
	            {
	                CurrentLeader = arr[i];
	                Console.Write(CurrentLeader+" ");
	            }
	        }
	    }
	    
	    
		public static void Main(string[] args)
		{
		    int[] arr = {16, 17, 4, 3, 5, 2};
		    
		    Leader(arr);
		    
		    
		    
// 		    foreach(int element in arr)
// 		    {
// 		        Console.Write(element+" ");
// 		    }
		    
// 			Console.WriteLine();
		}
	}
}
