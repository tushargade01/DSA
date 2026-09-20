/*

Positive, Negative, or Zero
Problem Statement: Given an integer N, determine whether it is positive, negative, or zero.

Example 1:
Input: -7
Output: Negative

Example 2:
Input: 15
Output: Positive

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{

        static string DetermineNum(int n){
            
            if(n>0){
                return "Positive";
            }
            else if(n<0){
                return "Negative";
            }
            
            return "Zero";
        }
    
		public static void Main(string[] args)
		{
			
			Console.WriteLine(DetermineNum(34));
			
		}
	}
}
