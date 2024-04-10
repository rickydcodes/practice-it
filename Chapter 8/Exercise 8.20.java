public boolean contains(int x, int y) {
    boolean containsX = x >= this.x && x <= this.x + this.width;
    boolean containsY = y >= this.y && y <= this.y + this.height;
    
    return containsX && containsY;
}

public boolean contains(Point p) {
    boolean containsX = p.x >= this.x && p.x <= this.x + this.width;
    boolean containsY = p.y >= this.y && p.y <= this.y + this.height;
    
    return containsX && containsY;
}