public static void xo(int size) {
    for (int y = 0; y < size; y++) {
        for (int x = 0; x < size; x++) {
            if (x == y || Math.abs(size - x - 1) == y) {
                System.out.print("x");
            } else {
                System.out.print("o");
            }
        }
        System.out.println();
    }
}