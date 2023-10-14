public class CreditCard extends BankCard{
    private double interestRate;

    public CreditCard(String currency, double balance, String name, double interestRate) {
        super(currency, balance, name);
        this.interestRate = interestRate;
    }

    @Override
    public void decreaseBalance(double amount) {
        balance -= amount;
    }


    public double getCredit(){
        if (Double.compare(balance, 0) == -1) {
            return balance;
        }
        return 0;
    }

}

