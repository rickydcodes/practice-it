public static void printDesign() {
    for (int rows = 1; rows <= 9; rows += 2) {
        for (int i = ((10 - rows) / 2); i >= 0; i--) {
            System.out.print("-");
        }
        
        for (int i = 0; i < rows; i++) {
            System.out.print(rows);
        }
        
        for (int i = ((10 - rows) / 2); i >= 0; i--) {
            System.out.print("-");
        }
        
        System.out.println();
    }
}