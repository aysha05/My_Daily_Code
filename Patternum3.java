import java.util.Scanner;
class Patternum3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int n= sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	
	}
}
	/*
	Enter the number:
4
0
0 1
0 1 2
0 1 2 3
*/
