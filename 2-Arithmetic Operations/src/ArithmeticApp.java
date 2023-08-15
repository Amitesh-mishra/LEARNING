import java.util.Scanner;

public class ArithmeticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER A TWO NUMBER");
		int num1=scan.nextInt()	;
		int num2=scan.nextInt();
		System.out.println(subtractNumbers(num1,num2));
		System.out.println("ENTER A TWO NUMBER");
		 num1=scan.nextInt()	;
		 num2=scan.nextInt();
		System.out.println(multiplyNumbers(num1,num2));
		System.out.println("ENTER A TWO NUMBER");
		num1=scan.nextInt()	;
	    num2=scan.nextInt();
		System.out.println(divideNumbers(num1,num2));
		System.out.println("ENTER A TWO NUMBER");
	    num1=scan.nextInt()	;
	    num2=scan.nextInt();
		System.out.println(findRemainder(num1,num2));
		System.out.println("ENTER A TWO NUMBER");
	    num1=scan.nextInt()	;
		 num2=scan.nextInt();
	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
		
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
		
	}

	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
		
	}

	public static int findRemainder(int num1, int num2) {
		return num1%num2;
		
	}


}
