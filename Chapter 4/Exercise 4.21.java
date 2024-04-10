public static void perfectNumbers(int n) {
    System.out.print("Perfect numbers up to " + n + ": ");
    for (int j = 3; j <= n; j++) {
        int sum = 0;
        for (int i = 1; i < j; i++) {
            if (j % i == 0) {
                sum += i;
            }
        }
        
        if (sum == j) {
            System.out.print(j + " ");
        }
    }
}