Given an integer N find the sum of the first N natural number.

Example 1:

Input:
N = 10
Output: 
55
Explanation:
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55.
  
  
Input - 
// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
 // } Driver Code Ends
//User function Template for Java

public static int nSum(int n){
    int ans = 0;

    for(int i=1;i<=n;i++) {
        ans = ans + i;
    }
    
    
    
    return ans;
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int ans = nSum(n);
            System.out.println(ans);
        }
        scn.close();
    }
}  // } Driver Code Ends

