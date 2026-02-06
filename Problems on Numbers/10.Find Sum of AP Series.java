// Use the formula for the sum of an A.P. series: Sum = n/2 * (2a + (n - 1) * d), where:
//     n is the number of terms in the series.
//     a is the first term of the series.
//     d is the common difference between terms.

class Main {
    public static void main(String[] args) {
        int n = 4, a = 2, d = 2;
        int ans = n * (2*a + (n-1)*d) / 2;
        System.out.println(ans);
    }
}
