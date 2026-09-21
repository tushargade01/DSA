/*

Sum of First N Natural Numbers
Problem Statement: Given a positive integer N, calculate the sum of all natural numbers from 1 to N.

Example 1:
Input: 5
Output: 15

Example 2:
Input: 10
Output: 55

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    static int NaturalNumSum(int n){
	        int sum=0;
	        for(int  i=1;i<=n;i++){
	            sum+=i;
	        }
	        return sum;
	    }
	    
		public static void Main(string[] args)
		{
			Console.WriteLine(NaturalNumSum(10));
		}
	}
}
