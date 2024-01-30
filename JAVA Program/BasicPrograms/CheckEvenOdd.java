import java.util.Scanner;

public class CheckEvenOdd{
	
	public static void main(String[] args){

		// create scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer number: ");
		int num = sc.nextInt();

		// check whether Even or Odd
		//if number is divisible by 2 completely, then it is Even otherwise Odd
		if(num % 2 == 0){
			System.out.println("Given number " + num + " is an Even number.");
		} else {
			System.out.println("Given number " + num + " is an Odd number.");
		}

	}

}