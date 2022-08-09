Given three integer, a,d and n. Where a is the first term, d is the common difference of an A.P.  Calculate the nth term of A.P.  The nth term is given by an = a + (n-1)d

Example1:

Input:
a = 5
d = 2
n = 5
Output:
13
Explanation:
anth = a + (n-1)d = 5 + (5-1)*2 = 5 + 8 = 13

Input - 
// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
 // } Driver Code Ends
//User function Template for Java

public static void utility(int a, int d, int n){
    //Complete the code above
    int ans = a + (n-1)*d;
    //Complete the code above
    
    //The line below prints the output. Don't change it!
    System.out.println(ans);
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int d = scn.nextInt();
            int n = scn.nextInt();
            utility(a, d, n);
        }
        scn.close();
    }
}  // } Driver Code Ends
