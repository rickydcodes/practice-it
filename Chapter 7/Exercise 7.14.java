public static boolean contains(int[] a1, int[] a2) {
    for (int i = 0; i < (a1.length - a2.length) + 1; i++) {
        int charsFound = 0;
        for (int j = 0; j < a2.length; j++) {
            if (a2[j] == a1[i + j]) {
                charsFound++;
            }
        }
        
        if (charsFound == a2.length) {
            return true;
        }
    }
    return false;
}