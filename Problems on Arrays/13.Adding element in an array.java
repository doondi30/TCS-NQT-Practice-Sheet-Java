import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ArrayList <Integer> ali = new ArrayList<>();

        for (int i : arr)
            ali.add(i);

        // insert at beginning
        ali.add(0, 0);

        // insert at end
        ali.add(9);

        // insert at position (index 3)
        ali.add(3, 21);

        for (int i : ali)
            System.out.println(i);
    }
}


//output

