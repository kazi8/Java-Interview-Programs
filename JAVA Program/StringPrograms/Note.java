import java.util.Scanner;

public class Note{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number: ");

		int a[] =  new int[3];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		for(int i = 0; i < a.length; i++){

			int aa= sc.nextInt();
			System.out.println(a[i]);
		}
		
	}
}