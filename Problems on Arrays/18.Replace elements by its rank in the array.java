import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 0};
        int[] temp = arr.clone();
        Arrays.sort(temp);

        int len = arr.length;
        int rank = 1;
        int[] result = new int[len]; 

        // Replace elements by rank

        for (int i = 0; i < len; i++) {
            if (i > 0 && temp[i] != temp[i - 1]) {
                rank++;
            }

            for (int j = 0; j < len; j++) {
                if (arr[j] == temp[i]) {
                    result[j] = rank;
                }
            }
        }

        for (int ele : result)
            System.out.print(ele + " ");
    }
}
