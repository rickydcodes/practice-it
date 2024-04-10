public void printPowersOfN(int base, int max) {
    for (int i = 0; i <= max; i++) {
        System.out.print((int) Math.pow(base, i) + " ");
    }
    System.out.println();
}