import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println(Math.max(a, b));

        sc.close();
    }
}
