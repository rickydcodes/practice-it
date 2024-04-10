public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    
    public Rectangle(int x, int y, int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative width or height");
        }
        
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public String toString() {
        return "Rectangle[x=" + this.x + ",y=" + this.y + ",width=" + this.width + ",height=" + this.height + "]";
    }
}