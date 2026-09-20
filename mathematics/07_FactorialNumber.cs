/*

Factorial of a Number
Problem Statement: Given a non-negative integer N, calculate its factorial. The factorial of N is the product of all integers from 1 to N. By definition, 0! = 1.

Example 1:
Input: 5
Output: 120

Example 2:
Input: 0
Output: 1

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    // using for loop
	    
	    static int Fact1(int n){
	        
	        if(n==1 || n==0){
	            return 1;
	        }
	        
	        int res = 1;
	        
	        for(int i=2;i<=n;i++){
	            res = res*i;
	        }
	        
	        
	        
	        return res;
	    }
        
        //using recursion
	   
        static int Fact(int n){
           
           if(n==1 || n==0){
               return 1;
           }
           
           return n * Fact(n-1);
        }
	    
		public static void Main(string[] args)
		{
			Console.WriteLine(Fact1(5));
		}
	}
}
