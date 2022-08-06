import java.util.Scanner;

public class number_prime_or_not {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = reader.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}




Solution - 
Enter a number
7
7 is a prime number.
