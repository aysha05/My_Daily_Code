import java.util.Scanner;
class Fibanacci_Series
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the fibannacii series: ");
		
		int num=sc.nextInt();
		
		int a=0,b=1,c;
		
		for(int i=0; i<num; i++)
		{
			c=a+b;
			
			System.out.println(c);
			
			a=b;
		    b=c;
			
		}
		
	}
}
