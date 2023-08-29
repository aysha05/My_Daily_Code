import java.util.Scanner;
class LCM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		int n1=sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int n2=sc.nextInt();
		
		int lcm=n1>n2?n1:n2;
		
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.println("The sum of"+n1+"and"+n2+"is"+lcm);
				
				break;
			}
			++lcm;
		}
	}
}