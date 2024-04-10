public void printGrid(int rows, int cols) {
    for (int row = 1; row <= rows; row++) {
        int num = row;
        System.out.print(num);
        
        for (int col = 1; col < cols; col++) {
            if (num < (rows * cols)) {
                num += rows;
            } else {
                num = row;                
            }
            System.out.print(", " + num);
        }
        System.out.println();
    }
}