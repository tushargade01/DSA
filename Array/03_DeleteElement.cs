/*

Delete Element from Array

Problem Statement: Given an integer array and a position pos, delete the element at the given position from the array.

Example 1:
Input: arr = [10, 20, 30, 40, 50], pos = 3
Output: [10, 20, 40, 50]

Example 2:
Input: arr = [5, 10, 15, 20], pos = 2
Output: [5, 15, 20]

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    //delete element by position
	    static void DeleteElement(int[] arr, int pos){
	        
	        if(arr.Length == 1 || arr.Length == pos)
	            arr[arr.Length-1] = 0;
	            
	        for(int i=pos-1; i<arr.Length-1;i++){
	            arr[i] = arr[i+1];
	        }
	        
	        arr[arr.Length-1] = 0;
	        
	        foreach(int element in arr){
	            Console.Write(element+" ");
	        }
	    }
	    
	    //delete element by value
	    static int DeleteElementValue(int[] arr, int x){
	        
	        int i;
	        for(i=0;i<arr.Length;i++){
	            if(arr[i]==x){
	                break;
	            }
	        }
	        
	        if(i==arr.Length){
	            return arr.Length;
	        }
	        
	        for(int j=i; j<arr.Length-1;j++){
	            arr[j] = arr[j+1];
	        }
	        
	        return arr.Length-1;
	    }
	    
	   
	    
		public static void Main(string[] args)
		{
		    
		    int[] arr = {10, 20, 30, 40, 50};
		    
		    DeleteElementValue(arr, 30);
		    
		    foreach(int element in arr){
	            Console.Write(element+" ");
	        }
		    
			Console.WriteLine();
			
		}
	}
}
