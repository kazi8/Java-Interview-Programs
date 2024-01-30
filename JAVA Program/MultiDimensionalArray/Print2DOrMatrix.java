public class Print2DOrMatrix{

	public static void main(String[] args){

		//declare and initialize a 2D array or a matrix
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 2, 3} };

		//print 2D array using for loops
		//outer for loop for row iteration
		for(int i = 0; i < arr.length; i++){
			
			// inne for loop for column iteration
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			//to move cursor to new line
			System.out.println();
		}
	}
}