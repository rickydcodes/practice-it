public boolean transactionFee(double fee) {
    for (int i = 1; i <= this.transactions; i++) {
        double feeTotal = (double) fee * i;
        if (this.balance - feeTotal >= 0) {
            this.balance -= feeTotal;
        } else {
            this.balance = 0;
        }
    }
    
    return this.balance > 0.0;
}