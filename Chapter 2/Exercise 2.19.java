public class Window {
    public static final int size = 3;
    
    public static void main(String[] args) {
        printDivider();
        for (int k = 0; k < 2; k++) {
            for (int rows = 0; rows < size; rows++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("|");
                    for (int i = 0; i < size; i++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("|");
                System.out.println();
            }
            
            printDivider();
        }
    }
    
    public static void printDivider() {
        System.out.print("+");
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < size; i++) {
                System.out.print("=");
            }
            System.out.print("+");
        }
        System.out.println();
    }
}