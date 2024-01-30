import java.util.Scanner;

public class FibonacciSeries{

	public static void main(String[] args){
	
		System.out.println("Enter a number up to which Fibonacci series to print: ");

		int upto = new Scanner(System.in).nextInt();

		// initiating first two numbers of the fibonacci series
		int num1 = 0;
		int num2 = 1;

		System.out.print(num1 + " " + num2);

		//start the loop from 3 because first two numbers are already printed
		for(int i = 3; i <= upto; i++){
			int nextNumber = num1 + num2;
			System.out.print(" " + nextNumber);
			num1 = num2;
			num2 = nextNumber;
		}
	}

}