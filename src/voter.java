import java.util.Scanner;

public class voter {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        int check;
        do{
            System.out.println("Enter the voter name");
            name = sc.next();
            System.out.println(" Enter the voter age");
            Scanner sc1 = new Scanner(System.in);
            age = sc.nextInt();
            if (age >= 18)
         {

            System.out.println(name + " is eligible to vote");
         }
            else 
        {
            System.out.println(name + " is not eligible to vote");
        }
        check =sc.nextInt();
        if ((check!=1 && check!=2))
            {
                System.out.println("Invalid entry");
            }
            System.out.println("continue 1 \n exit 2");
            
        } while (check==1);
            
            
}
}
