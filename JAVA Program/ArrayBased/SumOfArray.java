public class SumOfArray{

	public static void main(String[] args){

		int arr[] = { 1, 2, 3};

		int sum = 0;

		//iterating all array element to calculate the sum
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}

		System.out.print("The total sum of the given array: " + sum);
	}

}