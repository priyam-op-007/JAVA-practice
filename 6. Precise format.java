There are times when your answer is a floating point that contains undesired amount of digits after decimal. Here, we'll learn how to get a precise answer out of a floating number. You are given two floating numbers a and b. You need to output a/b and decimal precision of a/b upto 3 places after decimal point.
Note: You may use System.out.format()

Example 1:

Input:
5.43 2.653

Output:
2.046739 2.047
  
User Task:
Your task is to complete the provided function printInFormat().
Note: You don't need to give a new line character after using System.out.format().

Constraints:
1 <= a, b,<= 100
  
Solution - 
  
// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Geeks{
    
    static void printInFormat(float a, float b){
        float result = a/b;
        System.out.format(result+" "+"%.3f",result);
        
        
        // Your code here to print upto 3 decimal places
        
    }    
    
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
		//taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int testcases = sc.nextInt();
		
		while(testcases-- > 0){
		    
		    //taking 2 variables a,b
    		float a = sc.nextFloat();
    		float b = sc.nextFloat();
    		
    		//creating an object of class Geeks
    		Geeks g = new Geeks();
    		
    		//calling printInFormat() method
    		//of class Geeks
    		g.printInFormat(a, b);
    		System.out.println();
		
		}
		
	}
}
  // } Driver Code Ends
