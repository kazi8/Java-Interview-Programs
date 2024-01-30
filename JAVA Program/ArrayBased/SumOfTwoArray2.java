import java.util.Scanner;

public class SumOfTwoArray2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();

		int arr1[] = new int[n];
		int arr2[] = new int[n];

		//reading the arr1 values
		System.out.print("Enter " + n + " element(s) of the array1: ");
		for(int i = 0; i < n; i++){
			arr1[i] = sc.nextInt();
		}

		//reading the arr2 values
		System.out.print("Enter " + n + " element(s) of the array2: ");
		for(int i = 0; i < n; i++){
			arr2[i] = sc.nextInt();
		}

		//3rd array to store the sum
		int arr3[] = new int[arr1.length];

		//adding arr1 and arr2 and store into arr3
		for(int i = 0; i < arr1.length; i++){
			arr3[i] = arr1[i] + arr2[i];
		}

		//print the arr3 elements
		for(int i = 0; i < arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}
	}
}