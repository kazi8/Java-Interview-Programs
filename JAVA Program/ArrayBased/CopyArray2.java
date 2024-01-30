import java.util.Scanner;

public class CopyArray2{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();

		//declare the integer array of any given size
		int arr1[] = new int[n];

		//reading the array values
		System.out.print("Enter " + n + " element(s) of the array: ");
		for(int i = 0; i < n; i++){
			arr1[i] = sc.nextInt();
		}

		//declare another array to copy with same size
		int arr2[] = new int[arr1.length];

		//iterate first array and copy to second array
		for(int i = 0; i < arr1.length; i++){
			arr2[i] = arr1[i];
		}

		//print the copied array
		System.out.println("Copied array elements: ");
		for(int i = 0; i < arr2.length; i++){
			System.out.println(arr2[i] + " ");
		}
	}

}