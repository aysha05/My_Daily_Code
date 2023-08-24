import java.util.Scanner;
class Palindrome_number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num= sc.nextInt();
		int temp=num;
		
		int rev = 0;
		
		
		//run the loop until become num 0
		while(num!=0)
		{
			//get the last digit from num
			int rem= num%10;
			
			rev = rev*10+rem;
			
			//remove last digit from num
			num=num/10;
			
		}
		if(rev==temp)
		{
			System.out.println("It is a  palindrome.");
		}
		else
		{
			System.out.println("It is not a palindrome.");
		}
	}
}
/*
Enter the number:
121
It is a  palindrome.
*/