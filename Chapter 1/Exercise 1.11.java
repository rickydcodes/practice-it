public class TwoRockets {
    public static void main(String[] args) {
        drawBooster();
        drawBox();
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        drawBox();
        drawBooster();
    }

    public static void drawBox() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    
    public static void drawBooster() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
}