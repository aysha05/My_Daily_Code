import java.util.Scanner;

class InchsToCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a length in inches: ");

        double num = sc.nextInt();

        InchesToCm(num);
    }

    public static void InchesToCm(double num) {
        double centimeter = num * 2.54;

        System.out.println(centimeter + "cm");
    }
}