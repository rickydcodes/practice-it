public class SlashFigure {
    public static void main(String[] args) {
        for (int rows = 0; rows < 6; rows++) {
            for (int i = 0; i < rows * 2; i++) {
                System.out.print("\\");
            }
            
            for (int i = 0; i < (-4 * (rows + 1)) + 26; i++) {
                System.out.print("!");
            }
            
            for (int i = 0; i < rows * 2; i++) {
                System.out.print("/");
            }
            
            System.out.println();
        }
    }
}