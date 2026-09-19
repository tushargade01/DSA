/*
Problem Statement: Given an integer N, determine whether it is a prime number. A prime number is greater than 1 and has exactly two factors: 1 and itself.

Example 1:
Input: 17
Output: Prime

Example 2:
Input: 12
Output: Not Prime

*/

using System;

namespace HelloWorld {
    class Program {
        
        static bool IsPrimeMoreEffient(int n) {
            if(n <= 1) {
                return false;
            }
            
            if(n==2 || n==3){
                return true;
            }
            
            if(n%2 == 0 || n%3==0) {
                return false;
            }
            
            for(int i = 5; i*i<=n;i=i+6){
                if(n%i==0 || (n+2)%i==0){
                    return false;
                }
            }
            
            return true;
        }
        
        //efficient
        static bool IsPrime(int n){
            
            if(n<=1)
                return false;
            
            for(int i=2; i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            
            return true;
        }
        
        
        public static void Main(string[] args) {
            Console.WriteLine(IsPrime(27));
        }
    }
}