import java.util.Scanner;
class Check_fibanacii_or_not

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		int n1=0,n2=1,n3;
		
		while(true)
		{
			n3=n1+n2;
			if(n3==num)
			{
				System.out.println("It is a fibbanaccii.");
				break;
			}
			else if(n3>num)
			{
				System.out.println("It is not a fibanacci.");
				break;
			}
			else
			{
				n1=n2;
				n2=n3;
			}
		}
		
		
	}
}
/*
Enter the number:
4
It is not a fibanacci.

F:\java programs>java Check_fibanacii_or_not
Enter the number:
3
It is a fibbanaccii.
*/