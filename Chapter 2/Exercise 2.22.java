public class DollarFigure {
    public static void main(String[] args) {
        for (int row = 7; row > 0; row--) {
            for (int i = 0; i < (7 - row) * 2; i++) {
                System.out.print("*");
            }
            
            for (int i = 0; i < row; i++) {
                System.out.print("$");
            }
            
            for (int i = 0; i < row * 2; i++) {
                System.out.print("*");
            }
            
            for (int i = 0; i < row; i++) {
                System.out.print("$");
            }
            
            for (int i = 0; i < (7 - row) * 2; i++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}