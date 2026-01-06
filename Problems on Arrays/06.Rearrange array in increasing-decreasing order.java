import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 6, 15, 5, 9};
        Arrays.sort(arr);
        int len = arr.length;

        for (int i = 0; i < len / 2; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = len - 1; i >= len / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
