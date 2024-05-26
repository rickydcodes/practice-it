public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private int discounts = 0;
    
	public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
    }
    
	public void add(Item i) {
		super.receipt.add(i);
        if (this.preferred) {
            super.internalDiscount += i.getDiscount();
            super.total += (i.getPrice() - i.getDiscount());
            if (i.getDiscount() > 0) {
                this.discounts++;
            }
        } else {
            super.total += i.getPrice();
        }
	}
    
    public int getDiscountCount() {
        return this.discounts;
    }
    
    public double getDiscountAmount() {
        return super.internalDiscount;
    }
    
    public double getDiscountPercent() {
        return (super.internalDiscount * 100) / (super.getTotal() + super.internalDiscount);
    }
}