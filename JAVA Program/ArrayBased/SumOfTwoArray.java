public class SumOfTwoArray{

	public static void main(String[] args){

		int arr1[] = { 1, 2, 3, 4 };

		int arr2[] = { 5, 6, 7, 8 };

		// 3rd array to store the sum
		int arr3[] = new int[arr1.length];

		//adding arr1 and arr2 and storing into arr3
		for(int i = 0; i < arr1.length; i++){
			arr3[i] = arr1[i] + arr2[i];
		}

		//print the arr3 elements
		for(int i = 0; i < arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}

	}

}