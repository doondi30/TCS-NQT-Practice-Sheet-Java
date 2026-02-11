class Main {
    public static void main(String[] args) {
        int num = 12345;
        int n = num;
        int ans = 0;

        while (n > 0) {
            ans = ans * 10 + (n % 10);
            n = n / 10;
        }

        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + ans);
    }
}
