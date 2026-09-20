/*

Fibonacci Series
Problem Statement: Given a positive integer N, print the first N terms of the Fibonacci sequence. The sequence starts with 0 and 1, and each next number is the sum of the previous two numbers.

Example 1:
Input: 7
Output: 0 1 1 2 3 5 8

Example 2:
Input: 5
Output: 0 1 1 2 3

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    
	    static void Fibonacci(int n){
	        int a = 0;
	        int b = 1;
	        
	        for(int i=1;i<=n;i++){
	            
	            Console.Write(a+" ");
	            
	            int next = a+b;
	            
	            a = b;
	            b = next;
	        }
	    }
	    
		public static void Main(string[] args)
		{
			Console.WriteLine();
			Fibonacci(7);
		}
	}
}
