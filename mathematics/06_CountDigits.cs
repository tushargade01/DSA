/*

Count Digits
Problem Statement: Given an integer N, find the total number of digits present in the number.

Example 1:
Input: 12345
Output: 5

Example 2:
Input: 98
Output: 2

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	   
	   static int CountDigits(int n){
	       int count = 0;
	       
	       if(n==0){
	           return 1;
	       }
	       
	       while(n>0){
	           n/=10;
	           count++;
	       }
	       
	       return count;
	   }
	    
		public static void Main(string[] args)
		{
			Console.WriteLine(CountDigits(11));
		}
	}
}
