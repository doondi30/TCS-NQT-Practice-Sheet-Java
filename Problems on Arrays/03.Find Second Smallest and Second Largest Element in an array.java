class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < mini) mini = num;
            if (num > maxi) maxi = num;
        }

        System.out.println("The smallest element in the array is: " + mini);
        System.out.println("The largest element in the array is: " + maxi);
    }
}
