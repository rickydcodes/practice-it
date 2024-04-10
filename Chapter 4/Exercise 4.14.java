public static double pow2(double base, int exp) {
    double total = 1.0;
    
    if (exp >= 0) {
        for (int i = 1; i <= exp; i++) {
            total *= base;
        }
    } else {
        for (int i = exp; i < 0; i++) {
            total /= base;
        }
    }
    
    return total;
}