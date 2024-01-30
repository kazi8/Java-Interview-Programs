public class FindEvenOdd{
	
	public static void main(String[] args){
		
		int arr[] = { 1, 2, 3, 4, 5 };

		//iterate the array
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				System.out.println(arr[i] + " is an Even number.");
			} else{
				System.out.println(arr[i] + " is an Odd number.");
			}
		}
	}

}