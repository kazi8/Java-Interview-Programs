import java.util.Scanner;

public class CheckVowelConsonant{

	public static void main(String[] args){

		//create scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an alphabet character: ");
		//reads a character at the specified index value
		char ch = sc.next().charAt(0);

		// check Vowel or Consonant
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			System.out.println("The given character is a Vowel.");
		} else{
			System.out.println("The given character is a consonant.");
		}
	
	}
}