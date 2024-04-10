public int[][] matrixAdd(int[][] a, int[][] b) {
    int[][] result = new int[a.length][a.length > 0 ? a[0].length : 0];
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            result[i][j] = a[i][j] + b[i][j];
        }
    }
    return result;
}