public String toString() {
    String str = this.name + ", ";
    
    if (this.balance < 0) {
        str += "-$" + String.format("%.2f", Math.abs(this.balance));
    } else {
        str += "$" + String.format("%.2f", this.balance);
    }
    
    return str;
}