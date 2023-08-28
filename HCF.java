import java.util.Scanner;
class HCF
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two numbers: ");
		
		int a= sc.nextInt();
		int b = sc.nextInt();
		
		int g=0;
		for(int i=1; i<=a; i++)
		{
			if(a%i==0 && b%i==0)  
			{
                  g=i;
			}
		}
		System.out.println("The hcf is: "+g);
	}
}
//a=50; b=60;
/*
Enter the two numbers:
50
60
The hcf is: 10
*/