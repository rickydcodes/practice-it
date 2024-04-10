public boolean isUnique(int[] a) {
    for (int i = 0; i < a.length; i++) {
        int firstNum = a[i];
        for (int j = 0; j < a.length; j++) {
            if (j != i && firstNum == a[j]) {
                return false;
            }
        }
    }
    
    return true;
}