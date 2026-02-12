import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int n1 = 0, n2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");
            int s = n1 + n2;
            n1 = n2;
            n2 = s;
        }

        sc.close();
    }
}
