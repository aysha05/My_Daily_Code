import java.util.Scanner;
class Range_even_num
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting limit: ");
		
		int start= sc.nextInt();
		
		System.out.println("Enter the last limit: ");
		int last= sc.nextInt();
		
		for(int i=start; i<=last; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
/*
F:\java programs>java Range_even_num
Ebter the starting limit:
10
Enter the last limit:
100
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100
*/