// TC-O(n2) SC-O(1)

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 5}, {2, 3}, {4, 2}, {5, 1}, {2, 4}}; 
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
               if( arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0] ) {
                            System.out.println(arr[j][0]+" "+arr[j][1]);
                }
            }
        }
        
    }
} 

//using HashMap TC-O(n) SC-O(n)

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 5}, {2, 3}, {4, 2}, {5, 1}, {2, 4}};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            // check if reverse pair exists
            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("(" + second + ", " + first + ")");
            } else {
                map.put(first, second);
            }
        }
    }
}
