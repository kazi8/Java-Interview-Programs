public class EvenSumInArray{

	public static void main(String[] args){

		int arr[] = { 2, 3, 4, 5, 6 };

		int evenSum = 0;

		System.out.println("The sum of all even numbers: ");

		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				if(evenSum > 0){
					System.out.print(" + " + arr[i]);
				} else{
					System.out.print(arr[i]);
				}

				//calculate the even sum
				evenSum = evenSum + arr[i];
			}
		}
	
		//print evenSum
		System.out.println(" = " + evenSum);
	}

}