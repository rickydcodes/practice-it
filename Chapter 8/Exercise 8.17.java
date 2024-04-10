public boolean isCollinear(Point p) {
    double slope1 = (double) (this.p2.y - this.p1.y) / (this.p2.x - this.p1.x);
    double slope2 = (double) (this.p2.y - p.y) / (this.p2.x - p.x);
    double slope3 = (double) (this.p1.y - p.y) / (this.p1.x - p.x);
    
    return slope1 == slope2 && slope2 == slope3;
}