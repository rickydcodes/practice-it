public static int pow(int base, int exp) {
    int total = 1;
    for (int i = 1; i <= exp; i++) {
        total *= base;
    }
    return total;
}