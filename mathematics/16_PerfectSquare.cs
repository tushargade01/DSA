/*

Perfect Square
Problem Statement: Given a non-negative integer N, determine whether it is a perfect square. A number is a perfect square if it can be written as the square of an integer.

Example 1:
Input: 25
Output: Perfect Square

Example 2:
Input: 20
Output: Not Perfect Square

*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    static string PerfectSqure(int n){
	        
	        for(int i=1;i*i<=n;i++){
	            if((i*i) == n){
	                return "Perfect Square";
	            }
	        }
	        
	        return "Not Perfect Square";
	    }
	    
		public static void Main(string[] args)
		{
		    
			Console.WriteLine(PerfectSqure(16));
		}
	}
}
