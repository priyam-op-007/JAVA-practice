import java.util.Scanner;

public class multiplication_table_by_while_loop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number for its multiplication table ");
        int num = reader.nextInt();
        int i = 1;
        while (i <=num) {
            int c = num*i;
            System.out.println(num+" * "+i+" = "+c);
            i++;

        }
    }
}


Solution - 
Enter a number for its multiplication table 
10
10 * 1 = 10
10 * 2 = 20
10 * 3 = 30
10 * 4 = 40
10 * 5 = 50
10 * 6 = 60
10 * 7 = 70
10 * 8 = 80
10 * 9 = 90
10 * 10 = 100
