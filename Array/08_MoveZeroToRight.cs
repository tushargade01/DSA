/*

Move Zeros to the Right

Problem Statement: Given an integer array, move all the zeros to the right side of the array while maintaining the order of the non-zero elements.

Example 1:
Input: arr = [1, 0, 2, 0, 3, 4]
Output: [1, 2, 3, 4, 0, 0]

Example 2:
Input: arr = [5, 0, 0, 2, 8]
Output: [5, 2, 8, 0, 0]

*/



using System;

namespace HelloWorld
{
	public class Program
	{
	    static void Swap(int[] arr, int a, int b){
	        
	        int temp = arr[a];
	        arr[a] = arr[b];
	        arr[b] = temp;
	        
	    }
	    
	    static void MoveZeroRight(int[] arr){
	        
	        int count = 0;
	        
	        for(int i=0; i<arr.Length; i++){
	            
	            if(arr[i] != 0){
	                
	                Swap(arr, i, count);
	                
	                count++;
	            }
	        }
	    }
	    
	    
		public static void Main(string[] args)
		{
			int[] arr = {10,20,30,40,50};
			int[] arr1 = {10,12,24,34};
			int[] arr2 = {11,23,0,4,2};
			
		
		    MoveZeroRight(arr2);
		    
		    foreach(int i in arr2){
		        
		        Console.Write(i+" ");
		        
		    }
		}
	}
}
