/*

Remove Duplicates from Sorted Array

Problem Statement:
Given a sorted integer array, remove the duplicate elements from the array so that each element appears only once. Maintain the original order of the elements.

Example 1:
Input: arr = [1, 1, 2, 2, 3, 4, 4]
Output: [1, 2, 3, 4]

Example 2:
Input: arr = [2, 2, 3, 3, 3, 5]
Output: [2, 3, 5]

*/



using System;

namespace HelloWorld
{
	public class Program
	{
	    
	    static int RemoveDuplicates(int[] arr)
	    {
	        int res = 1; 
	        
	        for(int i=1; i<arr.Length; i++)
	        {
	            if(arr[i] != arr[res-1])
	            {
	                arr[res] = arr[i];
	                res++;
	            }
	        }
	        
	        return res;
	    }
	    
		public static void Main(string[] args)
		{
			int[] arr = {1, 1, 2, 2, 3, 4, 4};
		    
		    Console.WriteLine(RemoveDuplicates(arr));
		    
		    foreach(int i in arr){
		        
		        Console.Write(i+" ");
		        
		    }
		}
	}
}
