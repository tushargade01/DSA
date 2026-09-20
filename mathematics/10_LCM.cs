/*

LCM of Two Numbers
Problem Statement: Given two positive integers A and B, find their Least Common Multiple (LCM). The LCM is the smallest positive integer that is divisible by both numbers.

Example 1:
Input: 12 18
Output: 36

Example 2:
Input: 4 6
Output: 12

Even or Od

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    //using while loop
	    
	    static int GCD(int a, int b){
	       
	       while(b!=0){
	           int rem = a%b;
	           a = b;
	           b = rem;
	       }
	       
	       return a;
	    }
	    
	    static int LCM(int a, int b){
	        return (a*b)/GCD(a,b);
	    }
	    
	    
	    
	    
		public static void Main(string[] args)
		{
			
			Console.WriteLine(LCM(4,6));
			
		}
	}
}
