//sum and products of its equal is called spy number
import java.util.Scanner;
class Spy_Number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num =sc.nextInt();
		
		int sum=0, product=1;
		
		//run the loop util the number becomes 0
		while(num!=0)
		{
			int rem = num%10;
			
			sum= sum+rem;
			
			product= product*rem;
			
			num = num/10;
			
		}
		if(sum==product)
		{
			System.out.println("It is a spy number.");
			
		}
		else
		{
			System.out.println("It is not a spy number.");
		}

	}
}

/*
Enter the number:
22
It is a spy number.
*/