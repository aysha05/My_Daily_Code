import java.util.Scanner;
class Pattern_Triangle
{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numner: ");
		
		int n= sc.nextInt();
		
		int i,j;
		
		//outer loop to handle the number of rows 
		for( i=0; i<n; i++)
		{
			
			//inner loop to print the space
			for(j=0; j<n-i-1; j++)
			{
				System.out.print(" "+" ");
			}
			
			//inner loop to print star
			for(j=0; j<2*i+1; j++)
			{
				System.out.print("*"+" ");
			}
			//print the next line.
			System.out.println();
		}
	}
	
}
/*
Enter the numner:

10
                  *
                * * *
              * * * * *
            * * * * * * *
          * * * * * * * * *
        * * * * * * * * * * *
      * * * * * * * * * * * * *
    * * * * * * * * * * * * * * *
  * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * *

*/