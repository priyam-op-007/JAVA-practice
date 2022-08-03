import java.util.Scanner;

public class Count_number_of_digits {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("GIve a number");
        int num = reader.nextInt();
        int count = 0;
        for(;num != 0; num /= 10, ++count){
        }
        System.out.println("The number of digits are "+count);
    }
}

SOlution- 
GIve a number
123456
The number of digits are 6
