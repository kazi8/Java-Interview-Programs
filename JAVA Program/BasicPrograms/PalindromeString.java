public class PalindromeString{

	public static void main(String[] args){
	
		String str = "madam";

		//check palindrome
		if(isPalindromeString(str)){
			System.out.println(str + " is a palindrome string.");
		} else{
			System.out.println(str + " is not a palindrome string");
		}
	}

	//palindrome checking method
	public static boolean isPalindromeString(String str){
		String reverse = "";
	
		for(int i = 0; i < str.length(); i++){
			reverse = str.charAt(i) + reverse;
		}

		//checking whether both are equals
		if(reverse.equals(str)){
			//string is palindrome
			return true;
		}else{
			//string is not palindrome
			return false;
		}

	}

}