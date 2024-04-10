public static boolean isSorted(double[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i + 1] < array[i]) {
            return false;
        }
    }
    return true;
}