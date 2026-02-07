Given a geometric Progression (G.P) sequence with some inputs as
1. a, first term
2. r, common ratio
3. n, number of terms

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter common ratio (r): ");
        double r = sc.nextDouble();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        double sum;

        if (r == 1) {
            sum = a * n;
        } else {
            sum = a * (Math.pow(r, n) - 1) / (r - 1);
        }

        System.out.println("Sum of GP series = " + sum);
        sc.close();
    }
}
