import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string to check if its palindromic or not - ");
        String pal = reader.next();
        String rev = "";
        int len = pal.length();
        for(int i = len-1; i >=0;i--) {
            rev = rev + pal.charAt(i);

        }
        if(pal.equalsIgnoreCase(rev)){
            System.out.println("Its a palindromic string");
        }
        else {
            System.out.println("Its not a palindromic string");
        }
    }
}


Solution - 
Enter a string to check if its palindromic or not - 
Radar
Its a palindromic string
