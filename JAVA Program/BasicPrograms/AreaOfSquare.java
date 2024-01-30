import java.util.Scanner;

public class AreaOfSquare{

	public static void main(String[] args){

		double side, area;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter one side of square: ");
		side = sc.nextDouble();

		area = side * side;

		System.out.println("Area of the square :: " + area); 

	}
}