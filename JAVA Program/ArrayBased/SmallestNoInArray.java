public class SmallestNoInArray{
	
	public static void main(String[] args){

		int arr[] = { 5, 7, 1, 4 };

		//sorting the array element in ascending order
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){   //if we use < sign to descending order and find the largest no.
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		//array 0th element will be the smallest no.
		int smallestNo = arr[0];  // or arr[1] to find 2nd smallest no

		System.out.print("The smallest no in the array: " + smallestNo);
	}

}