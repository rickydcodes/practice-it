public int lastIndexOf(int[] array, int value) {
    int lastIndex = -1;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
            lastIndex = i;
        }
    }
    
    return lastIndex;
}