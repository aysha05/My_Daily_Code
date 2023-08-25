import java.util.Scanner;
class Power_of_number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base value: ");
		
		int base=sc.nextInt();
		
		System.out.println("Enter the raise value:  ");
		
		int raise=sc.nextInt();
		
		int pow = 1;
		
		for(int i=0;i<raise; i++)
		{
			pow=pow*base;
		}
		System.out.println(pow);
	}
}
/*
Enter the base value:
2
Enter the raise value:
2
4
*/