public class EggStop {
    public static void main(String[] args) {
        drawEgg();
        System.out.println();
        drawEgg();
        System.out.println("+--------+\n");
        drawUpperHalf();
        System.out.println("|  STOP  |");
        drawLowerHalf();
        System.out.println("+--------+");
    }
    
    public static void drawUpperHalf() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
                           
    public static void drawLowerHalf() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
                           
    public static void drawEgg() {
        drawUpperHalf();
        drawLowerHalf();
    }
}