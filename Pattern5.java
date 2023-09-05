import java.util.Scanner;
class Pattern5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num= sc.nextInt();
		
		int i,j;
		
		for( i=0; i<num; i++)
		{
			for( j=0; j<num-i-1; j++)
			{
				System.out.print(" "+" ");
			}
			
			for( j=0; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	
	}
}
/*
Enter the number:

5
        *
      * *
    * * *
  * * * *
* * * * *

*/