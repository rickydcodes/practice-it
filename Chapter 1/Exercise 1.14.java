public class Lanterns {
    public static void main(String[] args) {
        drawPyramid();
        System.out.println();
        
        drawPyramid();
        System.out.println("* | | | | | *");
        drawLargeLine();
        drawPyramid();
        System.out.println();
        
        drawPyramid();
        drawSmallLine();
        
        System.out.println("* | | | | | *");
        System.out.println("* | | | | | *");
        
        drawSmallLine();
        drawSmallLine();
    }
    
    public static void drawSmallLine() {
        System.out.println("    *****");
    }
    
    public static void drawLargeLine() {
        System.out.println("*************");      
    }
    
    public static void drawPyramid() {
        drawSmallLine();
        System.out.println("  *********");
        drawLargeLine();
    }
}