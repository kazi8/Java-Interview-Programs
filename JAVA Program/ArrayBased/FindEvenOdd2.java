import java.util.Scanner;

public class FindEvenOdd2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

 		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		//reading the array values
		System.out.print("Enter " + n + " element(s) of the array: ");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		//iterate the array
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is an even number.");
			} else{
				System.out.println(arr[i] + " is an odd number.");
			}
		}

	}

}