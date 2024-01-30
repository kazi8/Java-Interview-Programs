import java.util.Scanner;

public class CountVowels{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string to count vowels: ");
		String str = sc.nextLine();

		int vowelsCount = 0;

		//iterate over the given string
		for(int i = 0; i < str.length(); i++){
			//extract a character from string
			char ch = str.charAt(i);

			//check vowel character
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
				vowelsCount++;
			}
		}
		System.out.println("The total vowels count: " + vowelsCount);
	}
}