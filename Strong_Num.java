import java.util.Scanner;

class Strong_Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = sc.nextInt();

        int temp = num;

        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            int fact = 1;

            while (rem != 0) {
                fact = fact * rem;
                rem--;

            }
            sum = sum + fact;
            num = num / 10;

        }
        if (sum == temp) {
            System.out.println("It is a Strong number.");
        } else {
            System.out.println("It is not a Strong number.");
        }
    }
}