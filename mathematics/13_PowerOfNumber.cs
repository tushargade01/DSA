/*

Power of a Number
Problem Statement: Given two integers X and N, calculate X raised to the power N (X^N). Assume N is non-negative.

Example 1:
Input: 2 5
Output: 32

Example 2:
Input: 3 4
Output: 81

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{

        static int PowerOfNum(int x, int n){
            int res = 1;
            for(int i=1;i<=n;i++){
                res = res*x;
            }
            
            return res;
        }
        
    
		public static void Main(string[] args)
		{
			
			Console.WriteLine(PowerOfNum(3,4));
			
		}
	}
}
