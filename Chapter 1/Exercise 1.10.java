public class Egg2 {
    public static void main(String[] args) {
        drawUpperEgg();
        drawLowerEgg();
        drawSymbolString();
 
        drawUpperEgg();
        drawLowerEgg();
        
        drawSymbolString();
        drawLowerEgg();
        
        drawUpperEgg();
        drawSymbolString();
        drawLowerEgg();
    }
    
    public static void drawUpperEgg() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    
    public static void drawLowerEgg() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    
    public static void drawSymbolString() {
        System.out.println("-\"-\'-\"-\'-\"-");
    }
}