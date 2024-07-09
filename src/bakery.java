import java.util.Scanner;

public class bakery {
	public static void main(String[] args) {
		double Cakebill =0.0;
		double Puffbill=0.0;
		double Pizzabill = 0.0;
		double Burgerbill= 0.0;
		double totalbill= 0.0;
		String continueResponse;
		boolean continueShopping = false;
		Scanner sc = new Scanner (System.in);
		System.out.println("              !!! Welcome to our Bakery !!!");

		do { 
			System.out.println("Please confirm the Item");
			System.out.println("Press 1 for cake");
			System.out.println("Prss 2 for puffs");
			System.out.println("Press 3 for Pizza");
			System.out.println("Press 4 for Burger");

			int product = sc.nextInt();
			if (product ==1)
			{
				System.out.println("Please find the variety and  rates: \n1. Black Forest - Rs.900/kg\n2. Red velvet - Rs.1200/kg \n3. Cream cake - Rs.400/kg");
				System.out.println("Please enter the item number");
				int cake = sc.nextInt();
				if (cake==1)
				{
					System .out.println("You have selected Black Forest");
					System .out.println("Enter the Quantity in Kgs");
					double cakequantity = sc.nextDouble();
					Cakebill = cakequantity*900;
				}
				else if (cake==2)
				{
					System .out.println("You have selected Red Velvet");
					System .out.println("Enter the Quantity in Kgs");
					double cakequantity = sc.nextDouble();
					Cakebill = cakequantity*1200;
				}
				else if (cake==3)
				{
					System .out.println("You have selected Cream cake");
					System .out.println("Enter the Quantity in Kgs");
					double cakequantity = sc.nextDouble();
					Cakebill = cakequantity*400;
				}

				else
				{
					System.out.println("Invalid Selection");
				}
				System.out.println("Your bill amount is: Rs. "+ Cakebill+ "/-");
			}

			else if (product == 2)
			{
				System.out.println("Please find the variety and rates: \n1. Veg Puff - Rs.15/piece\n2. Egg Puff - Rs.20/piece \n3. Chicke Puff - Rs.30/piece");
				System.out.println("Please enter the item number");
				int puff = sc.nextInt();
				if (puff==1){
					System .out.println("You have selected Veg Puff");
					System .out.println("Enter the Quantity in numbers");
					int puffquantity = sc.nextInt();
					Puffbill = puffquantity*15;
				}
				if (puff==2){
					System .out.println("You have selected Egg Puff");
					System .out.println("Enter the Quantity in numbers");
					int puffquantity = sc.nextInt();
					Puffbill = puffquantity*20;
				}
				if (puff==3){
					System .out.println("You have selected Chicken Puff");
					System .out.println("Enter the Quantity in numbers");
					int puffquantity = sc.nextInt();
					Puffbill = puffquantity*30;
				}
				else
				{
					System.out.println("Invalid Selection");
				}
				System.out.println("Your bill amount is: Rs. "+ Puffbill+ "/-");
			}
			else if (product==3)
			{
				System.out.println("You have selected Pizza");
				System.out.println("Enter the Quantity");
				int Pizzaquantity= sc.nextInt();
				Pizzabill = Pizzaquantity*200;
				System.out.println("Your bill amount is: Rs. "+ Pizzabill+ "/-");
			}		
			else if (product==4)
			{
				System.out.println("You have selected Burger");
				System.out.println("Enter the Quantity");
				int Burgerquantity= sc.nextInt();
				Burgerbill = Burgerquantity*200;
				System.out.println("Your bill amount is: Rs. "+ Burgerbill+ "/-");
			}
			else {
				System.out.println(" Invalid selection");
			}
			System.out.println("Do you want to continue your purchase? (yes/no)");	
			continueResponse = sc.next();
		}while (!continueResponse.equalsIgnoreCase("no"));

		totalbill=Cakebill+Puffbill+Pizzabill+Burgerbill;
		System.out.println("Your total bill amount is: Rs. " + totalbill + "/-");
		System.out.println("        !!! Thank you for Shopping with us!!!");
	}
}
