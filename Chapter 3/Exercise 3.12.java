public double scientific(double base, double exponent) {
    double result = base;
    
    if (exponent > 0) {
        for (int i = 0; i < exponent; i++) {
            result *= 10;
        }
    } else {
        for (int i = 0; i > exponent; i--) {
            result /= 10;
        }
    }
    
    return result;
}