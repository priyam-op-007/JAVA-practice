import java.util.Scanner;

public class GCd_of_positive_and_negative_numbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1 = reader.nextInt();
        System.out.println("Enter the second number");
        int num2 = reader.nextInt();
        if(num1<0){
            num1 = -num1;
        }
        if(num2<0){
            num2 = -num2;
        }
        while(num1 != num2) {

            if(num1 > num2) {
                num1 -= num2;
            }

            else {
                num2 -= num1;
            }
        }

        System.out.println("GCD: " + num1);
    }
}


Solution -
Enter the First number
-5
Enter the second number
-10
GCD: 5
