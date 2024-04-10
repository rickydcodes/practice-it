public class StarFigure2 {
    public static final int size = 6;
    
    public static void main(String[] args) {
        for (int row = size - 1; row >= 0; row--) {
            for (int i = 0; i < row * 4; i++) {
                System.out.print("/");
            }
            
            for (int i = 0; i < ((size - 1) - row) * 8; i++) {
                System.out.print("*");
            }
            
            for (int i = 0; i < row * 4; i++) {
                System.out.print("\\");
            }
            
            System.out.println();
        }
    }
}