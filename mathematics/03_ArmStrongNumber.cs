/*

Armstrong Number
Problem Statement: Given a positive integer N, determine whether it is an Armstrong number. An Armstrong number is equal to the sum of its digits raised to the power of the number of digits.

Example 1:
Input: 153
Output: Armstrong Number
Explanation: 1³ + 5³ + 3³ = 153

*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    static void IsArmstrong(int n){
	        int orignal = n;
	        int temp = n;
	        int count = 0;
	        int sum = 0;
	        
	        while(n>0){
	            
	            n/=10;
	            count++;
	        }
	        
	        while(temp>0){
	            int digit = temp%10;
	            int pow = 1;
	            
	            for(int i = 1;i<=count;i++){
	                
	                pow = pow*digit;
	                
	            }
	            
	            sum +=pow;
	            
	            temp/=10;
	        }
	        
	        if(sum != orignal){
	            Console.WriteLine("Not Armstrong Number");
	        }else {
	            Console.WriteLine("Armstrong Number");
	        }
	        
	    }
	    
		public static void Main(string[] args)
		{
		    
		    
			IsArmstrong(153);
		}
	}
}
