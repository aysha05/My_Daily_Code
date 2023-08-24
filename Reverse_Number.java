import java.util.Scanner;
class Reverse_Number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		
		int rev=0;
		
		//run loop until num=0
		while(num!=0)
		{
			//get last digit from num
		   int rem = num%10;
			
			
			rev = rev*10+rem;
			
			//remove the last digit from num
			num= num/10;
		}
		
		System.out.println(rev);
		
	}
}