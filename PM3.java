import java.util.Scanner;

class PM3 {
    public static void checkOdd(int num) {
        boolean flag = false;

        while (num != 0) {
            int rem = num % 10;

            if (rem % 2 != 0) {
                flag = true;
                break;
            }
            num /= 10;

        }
        if (flag == true) {
            System.out.println("It contains odd digit");
        } else {
            System.out.println("It doesn't contains anys odd numbers");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number.");
        int num = sc.nextInt();

        checkOdd(num);
        checkPrime(num);
    }

    public static void checkPrime(int num) {
        String check = "not found";

        for (int i = num; i != 0; i /= 10) {
            int rem = i % 10;

            if (rem == 2 || rem == 5 || rem == 3) {
                check = "found";
                break;
            }

        }
        if (check == "found") {
            System.out.println("It contains prime digit.");
        } else {
            System.out.println("It doesn't contains prime digit.");
        }
    }
}