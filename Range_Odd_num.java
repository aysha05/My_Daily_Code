import java.util.Scanner;
class Range_Odd_num
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter starting num: ");
	
	int start= sc.nextInt();
	
	System.out.println("Enter the ending num: ");
	
	int end= sc.nextInt();
	
	for(int i=start; i<=end; i++)
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
}
}