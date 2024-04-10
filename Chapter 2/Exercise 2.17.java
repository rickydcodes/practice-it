public class SlashFigure2 {
    public static final int size = 7;
    
    public static void main(String[] args) {
        for (int rows = 0; rows < size; rows++) {
            for (int i = 0; i < rows * 2; i++) {
                System.out.print("\\");
            }
            
            for (int i = 0; i < (-4 * (rows + 1)) + (4 * size + 2); i++) {
                System.out.print("!");
            }
            
            for (int i = 0; i < rows * 2; i++) {
                System.out.print("/");
            }
            
            System.out.println();
        }
    }
}