import java.util.Scanner;
class Sum_of_digitof_givennum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num= sc.nextInt();
		int sum = 0;
		
		//run the loop until become num 0
		while(num !=0)
		{
			
			//get the last digit from num
			int rem =num%10;
			
			sum = sum+rem;
			
			// remove the last digit from num
			num= num/10;

			
		}
		System.out.println(sum);
		
	}
}

/*
Enter the number:
123
6
*/