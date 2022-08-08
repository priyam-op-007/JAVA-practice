Given two integer d and n. Where d is the day, out of 7 days of week, d varies from 0 to 6 as shown below.

0 - Sunday

1 - Monday

2 - Tuesday

3 - Wednesday

4 - Thursday

5 - Friday

6 - Saturday

Complete the function utility() with d and n as parameters. Print index for the day which is n days before the given day d.

 

Example 1:

Input:
d = 4
n = 3
Output:
1
Explanation: 3 days before the 4th is 1
  
  
Input - 
  
// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
 // } Driver Code Ends
//User function Template for Java

public static void utility(int d, int n){
    int x = n%7;
    int ans = d-x;
      if(ans>=0)
   {
       System.out.print(ans);
   }
   else
   {
       System.out.print(ans+7);
   }
    
    
    
    
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int d = scn.nextInt();
            int n = scn.nextInt();
            utility(d, n);
            System.out.println();
        }
        scn.close();
    }
}  // } Driver Code Ends
