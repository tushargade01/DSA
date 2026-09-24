/*

Search Element in Array

Problem Statement: Given an integer array and an element x, find the index of x in the array. If the element is not present, return -1.

Example 1:
Input: arr = [10, 20, 30, 40, 50], x = 30
Output: 2

Example 2:
Input: arr = [5, 8, 12, 15], x = 20
Output: -1

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    static int SearchElement(int[] arr, int x){
	        
	        for(int i=0; i<arr.Length;i++){
	            if(arr[i] == x){
	                return i;
	            }
	        }
	        
	        return -1;
	    }
	    
	   
	    
		public static void Main(string[] args)
		{
		    
		    int[] arr = {10,20,30,40,50};
		    
			Console.WriteLine(SearchElement(arr, 3));
		}
	}
}
