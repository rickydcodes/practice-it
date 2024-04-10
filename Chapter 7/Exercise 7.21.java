public boolean isMagicSquare(int[][] square) {
    for (int row = 0; row < square.length; row++) {
        if (square[row].length != square.length) {
            return false;
        }
    }
    
    int total = 0;
    int diagonal1 = 0;
    int diagonal2 = 0;
    int rows = 0;
    int cols = 0;
    int[] arr = {8, 1, 6};
    
    for (int i = 0; i < square.length; i++) {
        diagonal1 += square[i][i];
        diagonal2 += square[i][square.length - 1 - i];
    }
    for (int row = 0; row < square.length; row++) {
        int rowValues = 0;
        int colValues = 0;
        for (int col = 0; col < square.length; col++) {
            rowValues += square[row][col];
            colValues += square[col][row];
        }
        
        if (rowValues != rows) {
            rows = rowValues;
        }
        if (colValues != cols) {
            cols = colValues;
        }
    }
    
    return diagonal1 == diagonal2 && diagonal2 == rows && rows == cols;
}