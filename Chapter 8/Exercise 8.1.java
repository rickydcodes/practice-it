public int quadrant() {
    if (this.x > 0 && this.y > 0) {
        return 1;
    } else if (this.x > 0 && this.y < 0) {
        return 4;
    } else if (this.x < 0 && this.y > 0) {
        return 2;
    } else if (this.x < 0 && this.y < 0) {
        return 3;
    } else {
        return 0;
    }
}