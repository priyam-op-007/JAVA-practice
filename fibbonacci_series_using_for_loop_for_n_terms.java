import java.util.Scanner;

public class fibbonacci_series_using_for_loop_for_n_terms {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the no of n terms of fibbonacci");
        int num = reader.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("The fibbonacci series is");
        for(int i=1; i <=num; i++){
            System.out.print(firstTerm+" , ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;


        }
    }
}


Solution - 
enter the no of n terms of fibbonacci
10
The fibbonacci series is
0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 
