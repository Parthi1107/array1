import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter your input");
        int input = sc.nextInt();
        int first = 0;
        int second = 1;

        for (int i=1; i<=input;++i)
        {
           System.out.print(first + "  ");
            
           int next = first+second;
           first  = second;
           second = next;

        }

    }
    
}
