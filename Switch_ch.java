import java.util.Scanner;

class Switch_ch {
    public static void main(String[] args) {
        int a = 10, b = 20, ch;
        System.out.println("Enter the user choice..!");

        Scanner sc = new Scanner(System.in);

        ch = sc.nextInt();

        switch (ch) {
            case 1: {
                System.out.println("Addition" + (a + b));
                break;
            }
            case 2: {
                System.out.println("subtraction: " + (a - b));
                break;
            }
            case 3: {
                System.out.println("Multiplication: " + (a * b));
                break;
            }
            case 4: {
                System.out.println(" Division: " + (a * b));
                break;
            }
            default: {
                System.out.println("Invalid choice.");

            }

        }

    }
}