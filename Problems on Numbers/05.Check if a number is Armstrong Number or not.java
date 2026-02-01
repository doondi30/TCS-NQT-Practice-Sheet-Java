class Main {
    public static void main(String[] args) {
        int n = 153;
        int l = 0, num1 = n, num2 = n, ans = 0;

        while (num1 > 0) {
            num1 /= 10;
            l++;
        }

      //int l=(int) Math.log10(n) +1;

        while (num2 > 0) {
            int dig = num2 % 10;
            ans += (int) Math.pow(dig, l);
            num2 /= 10;
        }

        System.out.println(ans == n);
    }
}
