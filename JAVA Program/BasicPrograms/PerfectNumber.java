import java.util.Scanner;

public class PerfectNumber{

	public static void main(String[] args){
	
		long n, sum =0;
		
		System.out.println("Enter a integer number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();

		int i = 1;

		//executes until the condition becomes false
		while(i <= n/2){
			if(n % i == 0){
				//calculates the sum of factors
				sum = sum + i;
			}
			i++;
		}

		if(sum == n){
			System.out.println(n + " is a perfect number.");
		}
		else{
			System.out.println(n + " is not a perfect number.");
		}


	}

}