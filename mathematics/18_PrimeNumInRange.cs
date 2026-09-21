/*

Prime Numbers in a Range
Problem Statement: Given two integers L and R, print all prime numbers between L and R, including L and R if they are prime.

Example 1:
Input: 10 20
Output: 11 13 17 19

Example 2:
Input: 1 10
Output: 2 3 5 7

*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
	    
	    
	    //efficient
	    static bool checkPrime(int n){
	        if(n<=1){
	            return false;
	        }
	        
	        for(int i=2;i*i<=n;i++){
	            if(n%i==0){
	                return false;
	            }
	        }
	        
	        return true;
	    }
	    
	    
	    //more efficient
        static bool IsPrime(int n){
            if(n<=1){
                return false;
            }
            
            if(n==2 || n==3){
                return true;
            }
            
            if(n%2==0 || n%3==0){
                return false;
            }
            
            for(int i=5;i*i<=n;i=i+6){
                if(n%i==0 || (n+2)%i==0){
                    return false;
                }
            }
            
            return true;
        }
        
        
        static void PrimeRange(int start, int end){
            
            for(int i=start;i<=end;i++){
                
                if(IsPrime(i)){
                    
                    Console.Write(i+" ");
                    
                }
            }
        }
        
	    
		public static void Main(string[] args)
		{
		    
			PrimeRange(1,10);
		}
	}
}
