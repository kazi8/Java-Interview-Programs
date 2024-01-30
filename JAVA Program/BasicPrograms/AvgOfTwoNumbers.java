import java.util.Scanner;

public class AvgOfTwoNumbers{

	public static void main(String[] args){
		
		float num1, num2, sum, avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		num1 = sc.nextFloat();

		System.out.println("Enter the second number: ");
		num2 = sc.nextFloat();

		// calculating sum of given two numbers
		sum = num1 + num2;

		//calculating the average of given two numbers
		avg = sum/2;

		System.out.println("The average of the given two numbers= " + avg);

	}
}