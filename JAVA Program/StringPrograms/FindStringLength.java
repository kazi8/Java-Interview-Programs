import java.util.Scanner;

public class FindStringLength{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine(); //us next() for single word

		int length = 0;

		for(char ch : str.toCharArray()){
			//increment the count for each character
			length++;
		}

		System.out.println("The length of the string (" + str + ") is: " + length);
	}

}