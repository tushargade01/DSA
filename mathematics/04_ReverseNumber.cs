/*

Reverse a Number
Problem Statement: Given an integer N, reverse its digits and print the resulting number.

Example 1:
Input: 1234
Output: 4321

Example 2:
Input: 560
Output: 65

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    static int ReverseNum(int n){
	        int rev = 0;
	        
	        while(n>0){
	            int digit = n%10;
	            
	            rev = (rev*10)+digit;
	            
	            n/=10;
	        }
	        
	        return rev;
	    }
	    
		public static void Main(string[] args)
		{
			Console.WriteLine(ReverseNum(560));
		}
	}
}
