
import java.util.Scanner;
class Sum_oftwonum_bet_sumofnum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number: ");
		
		int start = sc.nextInt();
		
		System.out.println("Enter the ending number: ");
		
		int end= sc.nextInt();
		int sum = 0;
		
		for(int i= start; start<=end; start++)
		{
			sum = sum +start;
		}
		System.out.println(sum);
	}
}
/*
Enter the starting number:
45
Enter the ending number:
50
285
*/