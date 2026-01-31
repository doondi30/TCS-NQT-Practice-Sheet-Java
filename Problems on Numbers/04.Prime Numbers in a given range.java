class Main {
    public static void main(String[] args) {
        int a = 10, b = 16;

        for (int i = a; i <= b; i++) {
            if (i < 2) continue; // skip non-prime numbers
            boolean flag = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break; 
                }
            }

            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}
