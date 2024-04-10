public void evenBeforeOdd(int[] a) {
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            if (a[i] % 2 == 0 && a[j] % 2 != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}