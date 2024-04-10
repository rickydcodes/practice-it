public class DollarFigure2 {
    public static final int size = 5;
    
    public static void main(String[] args) {
        for (int row = size; row > 0; row--) {
            for (int i = 0; i < (size - row) * 2; i++) {
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
            
            for (int i = 0; i < (size - row) * 2; i++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}