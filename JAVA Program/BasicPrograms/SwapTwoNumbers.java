public class SwapTwoNumbers{

	public static void main(String[] args){
	
		int x = 10, y = 20;

		//print both number before swapping
		System.out.println("x = " + x + ", y = " + y);

		//logic to swap these numbers without using a third variable
		x = x + y;
		y = x - y;
		x = x - y;

		//printing the both number again after swapping
		System.out.println("x = " + x + ", y = " + y);


	}

}