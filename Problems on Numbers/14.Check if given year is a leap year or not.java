class Main {
    public static void main(String[] args) {
        int n = 2000;

        if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
            System.out.println(n + " : is a leap year");
        } else {
            System.out.println(n + " : is not a leap year");
        }
    }
}
// check if the year is divisible by 4 or 400 but not by 100
