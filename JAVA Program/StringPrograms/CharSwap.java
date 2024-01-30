public class CharSwap{

	static char[] swap(String str, int i, int j){
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return ch;
	}

	public static void main(String[] args){
	
		String s = "Hello World";

		System.out.println(swap(s, 6, s.length() - 2));
		System.out.println(swap(s, 0, s.length() - 1));
		System.out.println(s);
	}
}