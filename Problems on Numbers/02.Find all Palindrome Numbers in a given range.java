import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        for (int i = min; i <= max; i++) {
            int n = i;
            int a = 0;

            while (n > 0) {
                a = (a * 10) + (n % 10);
                n = n / 10;
            }

            if (a == i) {
                System.out.print(i + " ");
            }
        }
    }
}
