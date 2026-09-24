/*

Insert Element in Array

Problem Statement: Given an integer array, an element x, and a position pos, insert the element x at the given position in the array.

Example 1:
Input: arr = [10, 20, 30, 40], x = 25, pos = 3
Output: [10, 20, 25, 30, 40]

Example 2:
Input: arr = [5, 10, 15, 20], x = 8, pos = 2
Output: [5, 8, 10, 15, 20]

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    static int InsertElement(int[] arr, int pos, int x){
	        
	        for(int i=arr.Length-1; i>=pos;i--){
	            arr[i] = arr[i-1];
	        }
	        arr[pos-1] = x;
	        
	        return arr.Length;
	    }
	    
	   
	    
		public static void Main(string[] args)
		{
		    
		    int[] arr = {10,20,30,40,50};
		    
			Console.WriteLine(InsertElement(arr, 3, 25));
			
			foreach(int x in arr){
			    Console.Write(x+" ");
			}
		}
	}
}
