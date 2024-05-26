public class MinMaxAccount extends BankingAccount {
    private List<String> historyBalance;
    
    public MinMaxAccount(Startup s)	{
        super(s);
    }
    
    public int getMin() {
        List<String> balanceHistory = super.historyBalance;
        
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < balanceHistory.size(); i++) {
            String balance = balanceHistory.get(i).replace("$", "");
            double numBalance = Double.parseDouble(balance);
            double pennies = numBalance * 100;
            
            if (pennies < min) {
                min = pennies;
            }
        }
        
        return (int) min;
    }
    
    public int getMax() {
        List<String> balanceHistory = super.historyBalance;
        
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < balanceHistory.size(); i++) {
            String balance = balanceHistory.get(i).replace("$", "");
            double numBalance = Double.parseDouble(balance);
            double pennies = numBalance * 100;
            
            if (pennies > max) {
                max = pennies;
            }
        }
        
        return (int) max;
    }
}