import java.util.Scanner;
class Inverted_half_pyramid
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows: ");
		
		int num= sc.nextInt();
		
		for(int i = num; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
} 
/*
Enter the rows:
4

1 2 3 4
1 2 3
1 2
1
*/