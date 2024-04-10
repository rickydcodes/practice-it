public int mode(int[] array) {
    int largestNum = 0;
    int largestNumTotal = 0;
    
    for (int i = 0; i < array.length; i++) {
        int total = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == array[i]) {
                total++;
            }
        }
        
        if (((array[i] < largestNum) && total == largestNumTotal) || total > largestNumTotal) {
            largestNum = array[i];
            largestNumTotal = total;
        }
    }
    
    return largestNum;
}