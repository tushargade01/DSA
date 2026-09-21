/*

Square Root of a Number
Problem Statement: Given a non-negative perfect square N, find its square root.

Example 1:
Input: 64
Output: 8

Example 2:
Input: 144
Output: 12

*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
        static int RootNumber(int n){
            for(int i=1;i*i<=n;i++){
                if(i*i==n){
                    return i;
                }
            }
            
            return 1;
        }
	    
		public static void Main(string[] args)
		{
		    
			Console.WriteLine(RootNumber(144));
		}
	}
}
