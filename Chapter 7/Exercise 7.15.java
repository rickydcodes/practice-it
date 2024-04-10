public int[] collapse(int[] a) {
    if (a.length == 1) {
        return a;
    }
    
    int[] c = new int[a.length % 2 != 0 ? a.length / 2 + 1 : a.length / 2];
    for (int i = 0; i < a.length - 1; i += 2) {
        c[i / 2] = a[i] + a[i+1];
    }
    
    if (a.length % 2 != 0) {
        c[c.length - 1] = a[a.length-1];
    }
    
    return c;
}