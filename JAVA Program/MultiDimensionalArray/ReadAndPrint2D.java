import java.util.Scanner;

public class ReadAndPrint2D{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the rows in the matrix: ");
		int row = sc.nextInt();

		System.out.print("Please enter the columns in the matrix: ");
		int column = sc.nextInt();

		int[][] firstMatrix = new int[row][column];
		int[][] secondMatrix = new int[row][column];

		for(int r = 0; r < row; r++){
			for(int c = 0; c < column; c++){
				System.out.print(String.format("Enter firstMatrix[%d][%d] integer: ", r, c));
				firstMatrix[r][c] = sc.nextInt();
			}
		}

		for(int r = 0; r < row; r++){
			for(int c = 0; c < column; c++){
				System.out.print(String.format("Enter secondMatrix[%d][%d] integer: ", r, c));
				secondMatrix[r][c] = sc.nextInt();
			}
		}

		System.out.println("First Matrix: ");
		for(int r = 0; r < firstMatrix.length; r++){
			for(int c = 0; c < firstMatrix[r].length; c++){
				System.out.print(firstMatrix[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println("Second Matrix: ");
		for(int r = 0; r < secondMatrix.length; r++){
			for(int c = 0; c < secondMatrix[r].length; c++){
				System.out.print(secondMatrix[r][c] + " ");
			}
			System.out.println();
		}
	}

}