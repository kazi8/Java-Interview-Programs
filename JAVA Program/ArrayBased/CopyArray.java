public class CopyArray{

	public static void main(String[] args){

		//declare and initialize integer array
		int arr1[] = { 1, 2, 3, 4, 5};

		//declare another array to copy with same size
		int arr2[] = new int[arr1.length];

		//iterate first array and copy to second array
		for(int i = 0; i < arr1.length; i++){
			arr2[i] = arr1[i];
		}

		//print the copied array
		System.out.println("Copied array elements: ");
		for(int i =0; i < arr2.length; i++){
			System.out.println(arr2[i] + " ");
		}

	}

}