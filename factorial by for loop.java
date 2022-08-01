import java.util.Scanner;

import java.util.Scanner;
public class factorial_by_for_loop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number");
        int num = reader.nextInt();
        int fact = 1;
        for (int i=1;i <= num; i++) {
            fact = fact*i;
        }
        System.out.println("the factorial is " + fact);
    }
}



solution - 
enter a number
5
the factorial is 120
