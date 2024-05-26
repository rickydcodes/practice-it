public class FilteredAccount extends Account {
    private int filtered = 0;
    private int transactions = 0;
    
    public FilteredAccount(Client c) {
        super(c);
    }
    
    public boolean process(Transaction t) {
        this.transactions++;
        if (t.value() == 0) {
            this.filtered++;
            return true;
        }
        
        return super.process(t);
	}
    
    public double percentFiltered()	{
        if (transactions > 0) {
            return (double) (filtered * 100) / transactions;
        } else {
            return 0;
        }
    }
}