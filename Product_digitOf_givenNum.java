import java.util.Scanner;
class Product_digitOf_givenNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		
		int product =1;
		
		
		//run the loop until num becomes 0
		while(num!=0)
		{
			//get last digit from num
			  int rem=num%10;
			
		    product=rem*product;
		
			
			//remove last digit from num
			  num=num/10;
		}
		
		System.out.println(product);
	}
}

/*
Enter the number:
132
6
*/