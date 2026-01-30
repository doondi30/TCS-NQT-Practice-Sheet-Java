import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Not a Prime Number");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Not a Prime Number");
                return;
            }
        }

        System.out.println("Prime Number");
    }
}
