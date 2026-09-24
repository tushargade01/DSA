/*

Largest Element in Array

Problem Statement: Given an integer array, find the largest element in the array.

Example 1:
Input: arr = [10, 20, 5, 40, 30]
Output: 40

Example 2:
Input: arr = [5, 8, 2, 15, 10]
Output: 15

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    
	    static int GetLargest(int[] arr){
	        int largest = arr[0];
	        
	        for(int i=1; i<arr.Length;i++){
	            
	            if(arr[i] > largest){
	                largest = arr[i];
	            }
	        }
	        
	        return largest;
	    }
	   
	    
		public static void Main(string[] args)
		{
		    
		    int[] arr = {10, 20, 5, 40, 30};
		    
		    int[] arr1 = {5, 8, 2, 15, 10};
		    
		    
		    
		  //  foreach(int element in arr){
	   //         Console.Write(element+" ");
	   //     }
		    
			Console.WriteLine(GetLargest(arr1));
			
		}
	}
}
