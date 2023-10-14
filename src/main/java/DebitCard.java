public class DebitCard extends BankCard{

    public DebitCard(String currency, double balance, String name) {
        super(currency, balance, name);
    }

    @Override
    public void decreaseBalance(double amount) {
        if (Double.compare(balance, amount) == -1){
            throw new RuntimeException("Недостаточно средств");
        }
        balance -= amount;
    }

}
