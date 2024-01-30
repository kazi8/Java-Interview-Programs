import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args){
		
		System.out.print("Enter an integer number: ");

		int num = new Scanner(System.in).nextInt();

		if(num > 1 && checkPrime(num)){
			System.out.println("The given number is a prime number.");
		}else {
			System.out.println("The given number is not a prime number");
		}
	}

	//method to check whether number is prime or not
	public static boolean checkPrime(int num) {

		boolean isPrime = true;

		for(int i = 2; i <= (num/2); i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}