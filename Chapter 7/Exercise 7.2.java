public static int range(int[] array) {
    int max = array[0];
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
        if (max < array[i]) {
            max = array[i];
        }
        if (min > array[i]) {
            min = array[i];
        }
    }
    
    return (max - min) + 1;
}