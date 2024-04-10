public int[] append(int[] a1, int[] a2) {
    int[] newArray = new int[a1.length + a2.length];
    for (int i = 0; i < a1.length; i++) {
        newArray[i] = a1[i];
    }
    for (int i = 0; i < a2.length; i++) {
        newArray[a1.length + i] = a2[i];
    }
    
    return newArray;
}