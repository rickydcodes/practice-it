public void transfer(BankAccount acc2, double amount) {
    if (this.balance >= 5 && amount > 0) {
        this.balance -= 5;
        
        if (this.balance < amount) {
            acc2.deposit(this.balance);
            this.withdraw(this.balance);
        } else {
            acc2.deposit(amount);
            this.withdraw(amount);
            
        }
    }
}