import java.util.Scanner;

public class FibonacciSeriesWithRecursion{

	// initiating first two numbers of the fibonacci series
	static int num1 = 0;
	static int num2 = 1;

	public static void main(String[] args){

		System.out.println("Enter a number up to which fibonacci series to print: ");
	
		int upto = new Scanner(System.in).nextInt();

		//printing first two numbers
		System.out.print(num1 + " " + num2);

		//calling recursive function by decreasing 2 because two numbers are already printed
		printFibonacci(upto - 2);
	}

	//recursive function
	public static void printFibonacci(int count){

		if(count > 0){
			int nextNumber = num1 + num2;
			num1 = num2;
			num2 = nextNumber;

			System.out.print(" " + nextNumber);

			//call the recursive function again
			printFibonacci(count - 1);
		}
	}

}