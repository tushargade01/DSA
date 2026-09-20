/*

Even or Odd
Problem Statement: Given an integer N, determine whether the number is even or odd.

Example 1:
Input: 14
Output: Even

Example 2:
Input: 9
Output: Odd

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	   
	   static string EvenOdd(int n){
	       if(n<=0){
	           return "Given Number is Zero or Less Than Zero";
	       }
	       
	       if(n%2==0){
	           return "Even";
	       }
	       
	       return "Odd";
	   } 
	    
		public static void Main(string[] args)
		{
			
			Console.WriteLine(EvenOdd(0));
			
		}
	}
}
