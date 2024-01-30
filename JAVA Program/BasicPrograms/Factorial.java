import java.util.Scanner;

public class Factorial{

	public static void main(String[] args){

		System.out.println("Enter a number to calculate factorial: ");

		int num = new Scanner(System.in).nextInt();

		if(num < 0){
			System.out.println("Please enter only positive integer number");
			return;
		}

		System.out.println("Factorial of " + num + " is: " + calculateFactorial(num));
	}

	//method to calculate factorial withou recursion
	public static int calculateFactorial(int num){

		int factorial = 1;

		while(num != 0){
			factorial = factorial * num;
			num --;
		}
		return factorial;
	}

}