import java.util.Scanner;

class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        long num1 = sc.nextInt();

        System.out.println("The counting digit");

        int num2 = sc.nextInt();

        int count = 0;
        while (num1 != 0) {
            long rem = num1 % 10;

            if (rem == num2) {
                count++;
            }
            num1 = num1 / 10;

        }
        System.out.println(count);
    }
}