public Rectangle union(Rectangle rect) {
    int newX = Math.min(rect.x, this.x);
    int newY = Math.min(rect.y, this.y);
    int newW = Math.max(this.x + this.width, rect.x + rect.width);
    int newH = Math.max(this.y + this.height, rect.y + rect.height);
        
    return new Rectangle(newX, newY, newW - newX, newH - newY);
}