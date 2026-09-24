/*

Second Largest Element in Array

Problem Statement: Given an integer array, find the second largest element in the array.

Example 1:
Input: arr = [10, 20, 5, 40, 30]
Output: 30

Example 2:
Input: arr = [5, 8, 2, 15, 10]
Output: 10

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    
	    static int SecondLargest(int[] arr){
	        int largest = arr[0];
	        int second = arr[0];
	        
	        for(int i=1;i<arr.Length;i++){
	            if(arr[i]>largest){
	                second = largest;
	                largest = arr[i];
	            }
	            else if(arr[i]>second && arr[i] != largest){
	                second = arr[i];
	            }
	        }
	        
	        return second;
	    }
	   
	    
		public static void Main(string[] args)
		{
		    
		    int[] arr = {10, 20, 5, 40};
		    
		    int[] arr1 = {5, 8, 2, 15, 10};
		    
		    
		    
		  //  foreach(int element in arr){
	   //         Console.Write(element+" ");
	   //     }
		    
			Console.WriteLine(SecondLargest(arr));
			
		}
	}
}
