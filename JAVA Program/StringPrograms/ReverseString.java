import java.util.Scanner;

public class ReverseString{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String reverse = "";

		System.out.print("Please enter a string to reverse: ");
		String str = sc.nextLine();

		for(int i = str.length() - 1; i >= 0; i--){
			reverse = reverse + str.charAt(i);
		}

		System.out.print("The reverse of " +str+ " is: " + reverse);
	}
}