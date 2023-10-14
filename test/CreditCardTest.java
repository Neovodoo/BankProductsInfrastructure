import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    public void decreaseBalanceTestNegativeBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", 0d, "Visa", 15d);

        //when
        creditCard.decreaseBalance(0.01d);

        //then
        assertEquals(-0.01d, creditCard.getBalance());;
    }

    @Test
    public void decreaseBalanceTestZeroBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", 1000.01d, "Visa", 15d);

        //when
        creditCard.decreaseBalance(1000.01d);

        //then
        assertEquals(0d, creditCard.getBalance());
    }

    @Test
    public void decreaseBalanceTestPositiveBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", 10d, "Visa", 15d);

        //when
        creditCard.decreaseBalance(9d);

        //then
        assertEquals(1d, creditCard.getBalance());
    }

    @Test
    public void incrementBalanceTestNegativeBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", -10.1d, "Visa", 15d);

        //when
        creditCard.incrementBalance(11.1d);

        //then
        assertEquals(1d, creditCard.getBalance());
    }

    @Test
    public void incrementBalanceTestZeroBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", 0d, "Visa", 15d);

        //when
        creditCard.incrementBalance(1.1d);

        //then
        assertEquals(1.1d, creditCard.getBalance());
    }

    @Test
    public void incrementBalanceTestPositiveBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", 0.1d, "Visa", 15d);

        //when
        creditCard.incrementBalance(0.1d);

        //then
        assertEquals(0.2d, creditCard.getBalance());
    }

    @Test
    public void getCreditTestPositiveBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", 0.01d, "Visa", 15d);

        //then
        assertEquals(0d, creditCard.getCredit());
    }

    @Test
    public void getCreditTestZeroBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", 0d, "Visa", 15d);

        //then
        assertEquals(0d, creditCard.getCredit());
    }

    @Test
    public void getCreditTestNegativeBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", -0.01d, "Visa", 15d);

        //then
        assertEquals(-0.01d, creditCard.getCredit());
    }

    @Test
    public void getBalanceTestPositiveBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", 0.01d, "Visa", 15d);

        //then
        assertEquals(0.01d, creditCard.getBalance());
    }

    @Test
    public void getBalanceTestZeroBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", 0d, "Visa", 15d);

        //then
        assertEquals(0d, creditCard.getBalance());
    }

    @Test
    public void getBalanceTestNegativeBalance(){
        //given
        CreditCard creditCard = new CreditCard("rub", -0.01d, "Visa", 15d);

        //then
        assertEquals(-0.01d, creditCard.getCredit());
    }

}