import java.util.Scanner;

public class ReverseStringWithRecursion{

	public static void main(String[] args){

		String str = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a string to reverse: ");

		str = sc.nextLine(); //sc.next() for single word

		//final output
		System.out.println("Reverse of the given string is " + reverseString(str));

	}

	//recursive method
	public static String reverseString(String str){

		//return empty when string is empty
		if(str.equals("")){
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}

}