/*

Left Rotate Array by One

Left Rotate Array by D Places

Problem Statement:
Given an integer array and an integer D, left rotate the array by D positions. The first D elements should be moved to the end of the array while maintaining their order.

Example 1:
Input: arr = [1, 2, 3, 4, 5], D = 2
Output: [3, 4, 5, 1, 2]

Example 2:
Input: arr = [10, 20, 30, 40, 50, 60], D = 3
Output: [40, 50, 60, 10, 20, 30]

*/


using System;

namespace HelloWorld
{
	public class Program
	{
	    
	    static void Swap(int[] arr, int left, int right)
	    {
	        int temp = arr[left];
	        arr[left] = arr[right];
	        arr[right] = temp;
	    }
	    
	    static void Reverse(int[] arr, int low, int high)
	    {
	        while(low<high)
	        {
	            Swap(arr,low,high);
	            
	            low++;
	            high--;
	        }
	    }
	    
	    static void LeftRotate(int[] arr, int d)
	    {
	        d = d % arr.Length 
	        Reverse(arr,0,d-1);
	        Reverse(arr,d,arr.Length-1);
	        Reverse(arr,0,arr.Length-1);
	    }
	    
	    
	    //main logic for right rotate
	    static void RightRotate(int[] arr, int d)
        {
            d = d % arr.Length;
        
            Reverse(arr, 0, arr.Length - 1);
            Reverse(arr, 0, d - 1);
            Reverse(arr, d, arr.Length - 1);
        }
	    
	    
		public static void Main(string[] args)
		{
		    int[] arr = {1, 2, 3, 4, 5};
		    
		    LeftRotate(arr,3);
		    
		    foreach(int element in arr)
		    {
		        Console.Write(element+" ");
		    }
		    
			Console.WriteLine();
		}
	}
}
