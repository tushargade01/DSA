/*

Find All Divisors
Problem Statement: Given a positive integer N, print all positive integers that divide N without leaving a remainder.

Example 1:
Input: 12
Output: 1 2 3 4 6 12

Example 2:
Input: 15
Output: 1 3 5 15

*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    static void FindDivisors(int n){
	        int i=1;
	        for(;i*i<=n;i++){
	            if(n%i==0){
	                Console.Write(i+" ");
	            }
	        }
	        
	        for(i--;i>=1;i--){
	            if(n%i==0 && i!=(n/i)){
	                Console.Write((n/i)+" ");
	            }
	        }
	    }
	    
		public static void Main(string[] args)
		{
		    FindDivisors(15);
			Console.WriteLine();
		}
	}
}
