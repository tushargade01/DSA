/*

Reverse Elements of an Array

Problem Statement: Given an integer array, reverse the elements of the array.

Example 1:
Input: arr = [10, 20, 30, 40, 50]
Output: [50, 40, 30, 20, 10]

Example 2:
Input: arr = [5, 10, 15, 20]
Output: [20, 15, 10, 5]

*/



using System;

namespace HelloWorld
{
	public class Program
	{
	    
	    static void ReverseElement(int[] arr){
	        int low = 0;
	        int high = arr.Length-1;
	        
	        while(low<high){
	            int temp = arr[low];
	            arr[low] = arr[high];
	            arr[high] = temp;
	            
	            low++;
	            high--;
	        }
	    }
	    
		public static void Main(string[] args)
		{
			int[] arr = {10,20,30,40,50};
			int[] arr1 = {10,12,24,34};
			
			
			ReverseElement(arr1);
			
			foreach(int i in arr1){
			    Console.Write(i+" ");
			}
		}
	}
}
