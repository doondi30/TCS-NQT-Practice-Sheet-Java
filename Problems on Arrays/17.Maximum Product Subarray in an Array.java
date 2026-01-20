import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 4, 5};
        int len = arr.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr[k];
                }
                ans = Math.max(ans, prod);
            }
        }

        System.out.println(ans);
    }
}


