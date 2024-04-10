public double getSlope() {
    if (this.p1.x == this.p2.x) {
        throw new IllegalStateException("Both x values are the same");
    }
    
    double slope = (double) (this.p2.y - this.p1.y) / (this.p2.x - this.p1.x);
    
    return slope;
}