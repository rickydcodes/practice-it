public static void printRange(int min, int max) {
    if (max >= min) {
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    } else {
        for (int i = min; i >= max; i--) {
            System.out.print(i + " ");
        }
    }
    System.out.println();
}