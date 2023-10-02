package palindromeChecker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		CheckPalindrome checkpalindrome=new CheckPalindrome();
		boolean res =checkpalindrome.palindromeOrNot(n);
		if(res==true)
		{
			System.out.println("Enter number is palindrome");
			
		}
		else 
		{
			System.out.println("enter number is not palindrome");
		}

	}

}
