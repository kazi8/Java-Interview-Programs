public class StringSwap{

	public static void main(String[] args){

		String str1 = "Hello";
		String str2 = "World";

		System.out.printf("Before swapping str1 = %s and str2 = %s.\n", str1, str2);

		String temp = str1;
		str1 = str2;
		str2 = temp;

		System.out.printf("After swapping str1 = %s and str2 = %s.\n", str1, str2);
	}
}