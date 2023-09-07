//Pyramid means triangle
import java.util.Scanner;

class Pattern_Inverted_Triongle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numnber: ");
		
		int num= sc.nextInt();
		int i;
		
		for(i=1; i<=num; i++)
		{
			for(int j=1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=2; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}