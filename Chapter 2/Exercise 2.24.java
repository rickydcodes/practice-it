public class TwoRectangles {
    public static final int WIDTH = 7;
    public static final int HEIGHT = 4;
    
    public static void main(String[] args) {
        for (int row = 0; row < HEIGHT; row++) {
            for (int i = 0; i < WIDTH; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int row = 0; row < HEIGHT; row++) {
            for (int i = 0; i < WIDTH; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < WIDTH; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}