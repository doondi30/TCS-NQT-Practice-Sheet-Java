import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 10};
        int[] temp = arr.clone();   
        Arrays.sort(temp);

        int len = arr.length;
        int rank = 1;

        // Replace elements by rank
        for (int i = 0; i < len; i++) {
            if (i > 0 && temp[i] != temp[i - 1])
                rank++;

            for (int j = 0; j < len; j++) {
                if (arr[j] == temp[i]) {
                    arr[j] = rank;
                }
            }
        }

        for (int ele : arr)
            System.out.print(ele + " ");
    }
}
