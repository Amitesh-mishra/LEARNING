package tablePrinter;

import java.util.Scanner;

public class Main

{

public static void printTable(int num)
{
	for(int i=1;i<=10;i++)
	{
		int res=num*i;
		System.out.println(num+" "+"x"+" "+ i + " = "+res);
	}

}

public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	int number = scan.nextInt();
	printTable(number);
	

}

}