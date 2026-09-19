/*

Palindrome Number
Problem Statement: Given an integer N, check whether the number remains the same when its digits are reversed.

Example 1:
Input: 121
Output: Palindrome

Example 2:
Input: 123
Output: Not Palindrome

*/

using System;

namespace HelloWorld {
    class Program {
        
        static bool IsPallindrome(int n){
            int orignal = n;
            int rev = 0;
            
            while(n!=0){
                int digit = n%10;
                rev = (rev*10)+digit;
                n = n/10;
            }
            
            Console.WriteLine(rev);
            if(orignal==rev){
                return true;
            }
            return false;
        }
       
        
        
        public static void Main(string[] args) {
            Console.WriteLine(IsPallindrome(12321));
        }
    }
}
