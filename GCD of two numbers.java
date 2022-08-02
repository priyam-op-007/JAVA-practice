import java.util.Scanner;

public class GCD_of_two_numbers {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1 = reader.nextInt();
        System.out.println("Enter the second number");
        int num2 = reader.nextInt();
        int dest = 0;
        for(int i = 1;i <=num1 && i<=num2;i++) {
            if(num1%i==0 && num2%i==0) {
                dest = i;
            }
        }
        System.out.println("the GCD of the numbers "+num1+" and "+num2+ " are "+dest);
    }
}


Solution -
Enter the First number
10
Enter the second number
20
the GCD of the numbers 10 and 20 are 10
