import java.util.Scanner;

public class FactorialWithRecursion{

	public static void main(String[] args){

		System.out.print("Enter a number to calculate factorial: ");

		int num = new Scanner(System.in).nextInt();

		if(num < 0){
			System.out.println("Please enter only positive integer number");
			return;
		}

		System.out.println("Factorial of " + num + " is: " + calculateFactorial(num));
	}

	// method to calculate factorial using recursion
	public static int calculateFactorial(int num){
	
		if(num == 0){
			return 1;
		}

		return num * calculateFactorial(num - 1);
	}
}