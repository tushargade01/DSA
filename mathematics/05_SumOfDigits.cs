/*

Sum of Digits
Problem Statement: Given a positive integer N, calculate the sum of all its digits.

Example 1:
Input: 1234
Output: 10

Example 2:
Input: 567
Output: 18

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    static int SumOfDigit(int n){
	        int sum=0;
	        
	        while(n>0){
	            int digit = n%10;
	            
	            sum+=digit;
	            
	            n/=10;
	        }
	        
	        return sum;
	    }
	    
		public static void Main(string[] args)
		{
			Console.WriteLine(SumOfDigit(567));
		}
	}
}
