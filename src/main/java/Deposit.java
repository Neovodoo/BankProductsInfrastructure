public class Deposit extends BankDeposit{

    public Deposit(String currency, double balance, String name) {
        super(currency, balance, name);
    }

    @Override
    public void incrementBalance(double amount) {
        if (isDepositOpen == false){
            throw new RuntimeException("Вклад закрыт");
        }
        balance += amount;
    }


}
