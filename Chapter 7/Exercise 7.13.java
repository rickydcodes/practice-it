public int longestSortedSequence(int[] array) {
    int largestTotal = 0;
    
    for (int i = 0; i < array.length; i++) {
        int currentTotal = 1;
        int j = i;
        while (j < array.length - 1 && array[j + 1] >= array[j]) {
            currentTotal++;
            j++;
        }
        
        if (currentTotal > largestTotal) {
            largestTotal = currentTotal;
        }
    }
    
    return largestTotal;
}