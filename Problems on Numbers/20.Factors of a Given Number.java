import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);

                if (i != n / i) {   // avoid duplicate for perfect squares
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
