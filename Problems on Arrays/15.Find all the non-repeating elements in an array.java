import java.util.*;

class Main{
    public static void main(String[] args){

        int[] arr = {1, 2, -1, 1, 3, 1};

        Set<Integer> s = new LinkedHashSet<>();
        Set<Integer> d = new HashSet<>();

        for(int i : arr){
            if(!s.add(i)){
                d.add(i);
            }
        }

        s.removeAll(d);

        System.out.print(s);
    }
}
