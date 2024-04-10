public int countInRange(int[] array, int min, int max) {
    int total = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] >= min && array[i] <= max) {
            total++;
        }
    }
    
    return total;
}