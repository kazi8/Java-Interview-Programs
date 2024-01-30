import java.util.Scanner;

public class ReverseString{

	public static void main(String[] args){

		String str;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = sc.nextLine();

		System.out.print("After reverse string is: ");
		for(int i = str.length(); i > 0; i--){
			System.out.print(str.charAt(i-1));
		}
	}

}