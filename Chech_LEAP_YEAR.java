import java.util.Scanner;
class Chech_LEAP_YEAR
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the start year: ");
		
		int  start= sc.nextInt();
		
		System.out.println("Enter the last year: ");
		
		int last= sc.nextInt();
		
		for(int year=start; year<=last; year++)
		{
			if(year %4==0 && year%100!=0 || year%400==0)
			{
			  System.out.println(year);	
			}
			
		}
	}
}
