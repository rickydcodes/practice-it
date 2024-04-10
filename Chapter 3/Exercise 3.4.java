public void printSquare(int min, int max) {
    for (int row = min; row <= max; row++) {
        int num = row;
        for (int col = min; col <= max; col++) {
            System.out.print(num);
            
            if (num < max) {
                num++;
            } else {
                num = min;
            }
        }
        
        System.out.println();
    }
}