public static int numUnique(int a, int b, int c) {
    if (a == b && b != c || a == c && b!= a || b == c && c != a) {
        return 2;
    }
    
    if (a == b && b == c && c == a) {
        return 1;
    }
    
    return 3;
}