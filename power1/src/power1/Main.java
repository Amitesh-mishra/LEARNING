package power1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int num=scan.nextInt();
		int n=scan.nextInt();
		CheckPower c1=new CheckPower();
		int res=c1.raiseToPower(num, n);
		System.out.println(res);

	}

}
