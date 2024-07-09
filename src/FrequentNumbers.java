import java.util.Scanner;
public class FrequentNumbers {
    public static void main(String[] args) 
    {
        int[] a = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int i=0; i<a.length;i++)
        {
        a[i] = sc.nextInt();
        }

        int mostfrequentnumber=0;
        int maxCount = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) 
                {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostfrequentnumber = a[i];
            }
                }
                System.out.println(mostfrequentnumber + " is the most frequent number repeated " + maxCount + " times");
                sc.close();
            }
        }

