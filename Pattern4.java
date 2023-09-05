import java.util.Scanner;
class Pattern4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num = sc.nextInt();
		
		//outer loop to handle number of rows
		for(int i=0; i<num; i++)
		{
			for(int j=0; j< num-i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
/*
Enter the number:
4
* * * *
* * *
* *
*
*/