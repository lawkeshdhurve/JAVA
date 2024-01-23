import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        int a = 0;

        System.out.println("Enter the number: ");
        n = sc.nextInt();

        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                a = 1;
                break;
            }
        }

        if (a == 0 && n > 1) {
            System.out.println("Entered number is prime.");
        } else {
            System.out.println("It is not a prime number.");
        }
    }
}

