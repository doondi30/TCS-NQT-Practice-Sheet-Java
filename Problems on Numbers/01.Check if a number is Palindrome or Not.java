import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (num < 0) {
            System.out.println("Negative numbers are not palindromes.");
            return;
        }

        int n = num;
        int a = 0, m = 0;

        while (n > 0) {
            m = n % 10;
            a = (a * 10) + m;
            n = n / 10;
        }
        if(num == a){
            System.out.println("Palindrome");
        }
        else {
        System.out.println("Not Palindrome");
    }
    }
}
