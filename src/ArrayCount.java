import java.util.Scanner;

public class ArrayCount {
    public static void main(String args[])
    {
    int a[] = new int [6];
    
    System.out.println("Enter the values");
        Scanner sc = new Scanner(System.in);
        for ( int i=0;i< a.length; i++)  
        {
          a[i] = sc.nextInt();
        }
              
       int count20=0;
       int count30=0;
       
       for (int i=0;i<a.length;i++)
       {
        if (a[i] == 20)
        {
            count20++;
        }
        else if (a[i] == 30)
        {
            count30++;
        }

        
    }
        System.out.println("Count 20: " +count20);
        System.out.println("Count 30: " +count30);
        sc.close();
    }
    }

