import java.util.Scanner;

class Counting_the_digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");

        int num1 = sc.nextInt();

        int Count = 0;

        while (num1 > 0) {

            num1 = num1 / 10;

            count++;

        }
        System.out.println(cout);

    }
}