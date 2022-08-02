import java.util.Scanner;

public class print_the_required_alphabets {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the First alphabet");
        char alp1 = reader.next().charAt(0);
        System.out.println("Enter the second alphabet");
        char alp2 = reader.next().charAt(0);
        System.out.print("The alphabets are ");

        for(char i=alp1;i<=alp2;i++){
            System.out.print(i+" , ");
        }

    }
}


Solution -
Enter the First alphabet
b
Enter the second alphabet
t
The alphabets are b , c , d , e , f , g , h , i , j , k , l , m , n , o , p , q , r , s , t , 
