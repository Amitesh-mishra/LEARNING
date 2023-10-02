package sunOfDigits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		CalculateSum calculateSum = new CalculateSum();
		calculateSum.sumOfDigit(n);
		

		
	}

}
