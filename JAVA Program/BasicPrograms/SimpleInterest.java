import java.util.Scanner;

public class SimpleInterest{

	public static void main(String[] args){

		// declare the required variables
		float principal, rate, time, si;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the pricipal amount:: ");
		principal = sc.nextFloat();

		System.out.print("Enter the rate of interest:: ");
		rate = sc.nextFloat();

		System.out.print("Enter the time (in years):: ");
		time = sc.nextFloat();

		// calculate the simple interest
		si =(principal * rate * time) / 100;

		// print the result
		System.out.println("The simple interest:: " + si);
		System.out.println("Total amount to pay (with interest):: " + (principal + si));

	}
}