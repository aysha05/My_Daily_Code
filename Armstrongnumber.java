import java.util.Scanner;
class Armstrongnumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int temp=num;
		
		int count = 0;
		
		
		
		for(int i=num; i!=0;)
		{
			i=i/10;
			
			count ++;
			
		}
	
		int sum=0;
		
		while(temp!=0)
		{
			int rem= temp%10;
			
			int pow =1;
		
			for(int i=0; i<count; i++)
			{
				pow = pow * rem;
			}
				sum = sum+pow;
				
				temp = temp/10;
			}
			
			if(num==sum)
			{
				System.out.println("It is a armstrong number.");
			}
			else
			{
				System.out.println("It is not a armstrong number.");
			}
		}
	}
