public class StarFigure {
    public static void main(String[] args) {
        for (int row = 4; row >= 0; row--) {
            for (int i = 0; i < row * 4; i++) {
                System.out.print("/");
            }
            
            for (int i = 0; i < (4 - row) * 8; i++) {
                System.out.print("*");
            }
            
            for (int i = 0; i < row * 4; i++) {
                System.out.print("\\");
            }
            
            System.out.println();
        }
    }
}