import java.util.Scanner;

public class ReverseNumber{

	public static void main(String[] args){
	
		System.out.print("Enter a integer number: ");

		int num = new Scanner(System.in).nextInt();

		//initiating reverse variable with 0
		int reverse = 0;
		
		//while loop will continue until the number become 0
		while(num > 0){

			//finding the last digit of the number
			int remainder = num % 10;

			//calculating the reverse by multiplying it with 10 and adding remainder (last digit)
			reverse = reverse * 10 + remainder;

			//removing the last digit from the number
			num = num / 10;
		}
		
		System.out.print("The reverse of the given number is = " + reverse);
	}
}