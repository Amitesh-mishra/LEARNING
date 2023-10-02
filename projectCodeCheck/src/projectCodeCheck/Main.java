package projectCodeCheck;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a length of a array ");
		int arr[]=new int [scan.nextInt()];
		System.out.println("enter "+arr.length+" element of a array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("before sorting array element");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		KodnestSearchShort kss=new KodnestSearchShort();
				
		while(true)
		{
			System.out.println("enter your choice");
			System.out.println("press 1------>searching");
			System.out.println("press 2------>sorting");
			System.out.println("press 3------>finding minimum or maximum");
			System.out.println("press any other for-----> tata by by...");
			int choice=scan.nextInt();
			switch(choice) 
			{
			case 1:
				System.out.println("linear search---> 1 or binary search---> 2");
				int choice1=scan.nextInt();
				if(choice1==1)
				{
					System.out.println("enter key to search");
					int key=scan.nextInt();
					int res=kss.linearSearch(arr, key);
					if(res>=0)
					{
						System.out.println("key found at "+res);
					}
					else 
					{
						System.out.println("key not found");
					}
				}
					else if(choice1==2)
					{
						System.out.println("enter key to search");
						int key=scan.nextInt();
						int res=kss.binarySearch(arr, key);
						if(res>=0)
						{
							System.out.println("key found at "+res);	
						}
						else 
						{
							System.out.println("key not found");
						}
					}
					else
					{
						System.out.println("go to vasan eye care and come back");
						return;
					}
				break;
			case 2:
				System.out.println("press 1--->bubbleSort");
				System.out.println("press 2--->seletionSort");
				System.out.println("press 3--->insertionSort");
				int choice2=scan.nextInt();
				if(choice2==1)
				{
					System.out.println("enter 1--->asce or enter 2--->desc ");
					int choice3=scan.nextInt();
					if(choice3==1)
					{
					kss.bubbleSortAscending(arr);
					System.out.println("array elements after sorting");
					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					System.out.println();
					}
					else if(choice3==2)
					{
					kss.bubbleSortDescending(arr);
					System.out.println("array elements after sorting");
					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					System.out.println();
					}
					else
					System.out.println("got to vassan care");
				}
				if(choice2==2)
				{
					System.out.println("enter 1--->asce or enter 2--->desc ");
					int choice3=scan.nextInt();
					if(choice3==1)
					{
					kss.selectionSortAscending(arr);
					System.out.println("array elements after sorting");

					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					System.out.println();
					}
					else if(choice3==2)
					{
					kss.selectionSortDescending(arr);
					System.out.println("array elements after sorting");

					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					System.out.println();
					}
					else
					System.out.println("got to vassan care");
				}
				if(choice2==3)
				{
					System.out.println("enter 1--->asce or enter 2--->desc ");
					int choice3=scan.nextInt();
					if(choice3==1)
					{
					kss.insertionSortAscending(arr);
					System.out.println("array elements after sorting");

					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					System.out.println();
					}
					else if(choice3==2)
					{
					kss.insertionSortDescending(arr);
					System.out.println("array elements after sorting");

					for(int i=0;i<=arr.length-1;i++)
					{
						System.out.print(arr[i]+" ");
					}
					System.out.println();
					}
					else
					System.out.println("got to vassan care");
				}
				else 
				{
					System.out.println("go to vasan eye care and come back");
					return;
				}
			case 3:
				System.out.println("press 1--->minimum or press 2--->maximunm ");
				int choice4=scan.nextInt();
				if(choice4==1)
				{
					int res=kss.findMinimum(arr);
					System.out.println("minimum element is "+res);
					
				}
				else if(choice4==2)
				{
					int res=kss.findMax(arr);
					System.out.println("maximum element is "+res);
					
				}
				else
				{
					System.out.println("go to vasan eye care and come back");
				    return;
				}
			    break;
			default:
				System.out.println(" tata by by...");
				return;
				
				
			
			
		}

	}

}
}
