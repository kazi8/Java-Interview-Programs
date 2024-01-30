public class AverageUsingArray{

	public static void main(String[] args){

		int arr[] = { 2, 5, 1, 10 };

		int sum = 0;

		float average = 0.0f;

		//iterating all array elements to calculate the sum
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}

		//calculating the average
		average = (float) sum / arr.length;

		System.out.print("The average of the given array: " + average);
	}
}