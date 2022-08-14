Given an integer y. Check whether it can represent a leap year or not.

Example 1:

Input:
y = 2020
Output:
True
Explanation:
2020 is leap year as it multilpe of 4 but
not of 100

Input - 

// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
 // } Driver Code Ends
//User function Template for Java

public static void utility(int y){
    String isLeap = "False";

    //Your code below
    //Assign True or False to isLeap
    if(y%4==0 && y%100 !=0) isLeap="True";
    else if(y%400==0) isLeap="True";
    else isLeap = "False";
     
    //Your code above
    
    //The line below prints the output
    System.out.println(isLeap);
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int y = scn.nextInt();
            utility(y);
        }
        scn.close();
    }
}  // } Driver Code Ends
