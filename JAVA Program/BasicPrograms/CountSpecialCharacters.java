class CountSpecialCharacters{

	public static void main(String[] args){

		String str = "Hello@%&World!#123";
		int upperCount = 0;
		int lowerCount = 0;
		int numCount = 0;
		int specialCharCount = 0;

		//iterate over the string
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				upperCount++;
			else if(ch >= 'a' && ch <= 'z')
				lowerCount++;
			else if(ch >= '0' && ch <= '9')
				numCount++;
			else
				specialCharCount++;
		}
		System.out.println("Lowercase count: " + lowerCount);
		System.out.println("Uppercase count: " + upperCount);
		System.out.println("Numbers count: " + numCount);
		System.out.println("Special characters count: " + specialCharCount);
	}
}