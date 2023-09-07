//number triangel pattern
import java.util.Scanner;

class Patnumtriangle
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		int i,j;
		
		//  outer loop to handle number of rows
		for( i=1; i<=num; i++);
		{
			//inner loop to print space
			for( j=1; j<=num - i;j++)
			{
				System.out.print(" ");
			}
			
			// inner loop to print star
			for( j=1; j<num; j++)
			{
				System.out.print(i+"*");
			}
			System.out.println();
		}
		
		
	}
}