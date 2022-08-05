import java.util.Scanner;

public class Palindromic_number {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to check if its palindromic or not");
        int pal = reader.nextInt();
        int pal1 = pal;
        int num = 0;
        for(;pal1!=0;pal1=pal1/10){  //for(;pal1>=0;pal1=pal1/10){
            num = num*10 + pal1%10;
        }
        if (num == pal){
            System.out.println("Its a palindromic number");

        }
        else{
            System.out.println("Its not a palindromic number");
        }
    }
}


Solution - 
Enter a number to check if its palindromic or not
121
Its a palindromic number
