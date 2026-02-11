class Main {
    public static void main(String[] args) {
        int num = 2746;
        int mini = 9;   // Since digits are from 0–9
        int maxi = 0;
        int n = num;

        while (n > 0) {
            int digit = n % 10;
            mini = Math.min(mini, digit);
            maxi = Math.max(maxi, digit);
            n = n / 10;
        }

        System.out.println("Maximum digit is: " + maxi);
        System.out.println("Minimum digit is: " + mini);
    }
}
