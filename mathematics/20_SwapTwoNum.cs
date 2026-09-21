/*

Swap Two Numbers
Problem Statement: Given two numbers A and B, swap their values and print the values after swapping.

Example 1:
Input: 5 10
Output: 10 5

Example 2:
Input: 20 7
Output: 7 20

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    //using third variable
	    static void SwapNumber(int a, int b){
	        int temp = a;
	        a=b;
	        b=temp;
	        
	        Console.WriteLine(" a:"+a+" b:"+b);
	    }
	    
	    // without third Variable
	    static void SwapTwoNumber(int a, int b){
	        a = a+b;
	        b = a-b;
	        a = a-b;
	        
	        Console.WriteLine(" a:"+a+" b:"+b);
	    }
	    
		public static void Main(string[] args)
		{
		    SwapNumber(5,10);
		    SwapTwoNumber(12,78);
			Console.WriteLine();
		}
	}
}
