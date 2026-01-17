//Bruteforce method

import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 4, 2, 4, 5};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;  
                }
            }
        }
    }
}

//Using Set

import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i : arr) {
            if (!seen.add(i)) {
                duplicates.add(i);
            }
        }

        System.out.println(duplicates);
    }
}

