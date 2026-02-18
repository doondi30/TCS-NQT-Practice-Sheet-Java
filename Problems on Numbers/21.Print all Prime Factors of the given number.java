import java.util.*;

class Main {
    public static void main(String[] args) {
        int num = 135;

        System.out.print("Prime Factors: ");

        // Print the number of 2s that divide num
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        // Check for odd factors from 3 to sqrt(num)
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        // If num becomes a prime number greater than 2
        if (num > 2) {
            System.out.print(num);
        }
    }
}
