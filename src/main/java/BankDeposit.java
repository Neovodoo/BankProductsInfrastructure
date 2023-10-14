public abstract class BankDeposit extends BankProduct {

    protected boolean isDepositOpen = true;

    public BankDeposit(String currency, double balance, String name) {
        super(currency, balance, name);
    }


    public abstract void incrementBalance (double amount);

    public void close(){
        isDepositOpen = false;
    }
}
