import java.util.Scanner;
class primeNumber
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num = sc.nextInt();
		

		int i;
		for( i=2; i<num;i++)
		{
			if(num%i==0)
			{
				
				break;
				
			}
		}
		if(num==i)
			
			{
				System.out.println("It is a prime number.");
			}
			else
			{
				System.out.println("It not a prime number.");
			}	
	}
}
/*
Enter the number:
5
It is a prime number.*/