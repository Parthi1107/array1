import java.util.Arrays;
import java.util.Scanner;

class Arraysort {
	public static void main(String args[])
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length = sc.nextInt();
		int a[] = new int [length];
		System.out.println("Enter the values of array");
		for (int i=0;i<a.length;i++)
		a[i] = sc.nextInt();
		Arrays.sort(a);
		if (length>1)
			System.out.println("The second smallest element in the array is " + a[1]);
			else
			{
				System.out.println("Second smallest element not found!!!!");
			}
	}
}
