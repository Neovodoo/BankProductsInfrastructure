public abstract class BankCard extends BankProduct{

    public BankCard(String currency, double balance, String name) {
        super(currency, balance, name);
    }

    public void incrementBalance (double amount){
        this.balance += amount;
    }

    public abstract void decreaseBalance(double amount);

}
