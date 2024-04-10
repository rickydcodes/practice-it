public void printPowersOf2(int max) {
    for (int i = 1; i <= Math.pow(2, max); i *= 2) {
        System.out.print(i + " ");
    }
    System.out.println();
}