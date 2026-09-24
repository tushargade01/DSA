/*

Leap Year

Problem Statement: Given an integer year, check whether the given year is a leap year or not.

Example 1:
Input: 2024
Output: Leap Year

Example 2:
Input: 2023
Output: Not a Leap Year

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    
	    static string IsLeapYear(int n){
	        if(n%400==0){
	            return "Leap Year";
	        }
	        else if(n%100==0){
	            return "Not a Leap Year";
	        }
	        else if(n%4==0){
	            return "leap Year";
	        }
	        
	        return "Not a leap Year";
	    }
	    
		public static void Main(string[] args)
		{
			Console.WriteLine(IsLeapYear(1900));
		}
	}
}
