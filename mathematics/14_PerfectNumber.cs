/*

Perfect Number
Problem Statement: Given a positive integer N, determine whether it is a perfect number. A perfect number is equal to the sum of all its positive divisors excluding the number itself.

Example 1:
Input: 6
Output: Perfect Number
Explanation: 1 + 2 + 3 = 6

Example 2:
Input: 10
Output: Not Perfect Number
Explanation: 1 + 2 + 5 = 8

*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{

        
        static void Divisors(int n){
            
            for(int i=1; i*i<=n;i++){
                
                if(n%i==0){
                    
                    Console.Write(i+" ");
                    
                    if(i!=(n/i)){
                    
                    Console.Write((n/i)+" ");
                    
                    }
                    
                }
                
            }
        }
        
        //using this logic we can print numbers accending (incresing) order.
        
        static void DivisorsIncresing(int n){
            int i;
            
            for(i=1;i*i<=n;i++){
                
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
        
        static string PerfectNumber(int n){
            int sum = 0;
            int i=1;
            
            for(;i*i<=n;i++){
                if(n%i==0){
                    sum+=i;
                    //Console.Write(i+" ");
                }
            }
            
            
            for(i--;i>=2;i--){
                if(n%i==0 && i!=(n/i)){
                    //Console.Write((n/i)+" ");
                    sum = sum + (n/i);
                }
            }
            
            if(sum!=n){
                return "Not Perfect Number";
            }
            return "perfect Number";
        }
        
    
		public static void Main(string[] args)
		{
			
			//DivisorsIncresing(36);
			
			
			Console.WriteLine(PerfectNumber(10));
			
		}
	}
}
