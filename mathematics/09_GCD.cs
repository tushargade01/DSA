/*

GCD / HCF of Two Numbers
Problem Statement: Given two positive integers A and B, find their Greatest Common Divisor (GCD), also known as the Highest Common Factor (HCF).

Example 1:
Input: 12 18
Output: 6

Example 2:
Input: 8 20
Output: 4

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
	    
	    static int Gcd(int a, int b){
	        
	        while(b!=0){
	            int rem = a%b;
	            
	            a = b;
	            
	            b = rem;
	        }
	        
	        return a;
	    }
	    
	    //using recursion
	    
	    static int GCD(int a, int b){
	        
	        if(b==0){
	            return a;
	        }
	        
	        return GCD(b, a%b);
	    }
	    
	    
		public static void Main(string[] args)
		{
			Console.WriteLine(Gcd(8,20));
			Console.WriteLine(GCD(12,18));
			
		}
	}
}
