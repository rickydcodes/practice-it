public int minGap(int[] a) {
    if (a.length < 2) {
        return 0;
    }
    
    int smallest = a[0];
    for (int i = 0; i < a.length - 1; i++) {
        int diff = a[i + 1] - a[i];
        if (smallest > diff) {
            smallest = diff;
        }
    }
    
    return smallest;
}