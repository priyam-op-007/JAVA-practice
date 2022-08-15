Given two numbers a and b; you need to perform basic mathematical operation on them. You will be provided an integer named as operator. 

If operator equals to 1 add a and b, then print the result.

If operator equals to 2 subtract b from a, then print the result.

If operator equals to 3 multiply a and b, then print the result.

If operator equals to any another number, print "Invalid Input"(without quotes).


Example 1:

Input:
a = 1
b = 2
operator = 3
Output: 
2
Explanation: 1 * 2 = 2

Input - 

// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
 // } Driver Code Ends
//User function Template for Java

public static void utility(int a, int b, int operator){

    //write your code here
    if (operator == 1) {
        System.out.print(a+b);
    }
    else if (operator == 2) {
        System.out.print(a-b);
    }
    else if (operator == 3) {
        System.out.print(a*b);
    }
    else {
        System.out.println("Invalid Input");
    }
    
    
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int operator = scn.nextInt();
            utility(a, b, operator);
            System.out.println();
        }
        scn.close();
    }
}  // } Driver Code Ends
