import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DebitCardTest {
    @Test
    public void decreaseBalanceTestNegativeBalance(){
        //given
        DebitCard debitCard = new DebitCard("rub", 1000, "Visa");

        //then
        assertThrows(RuntimeException.class, () -> debitCard.decreaseBalance(2000d));
    }

    @Test
    public void decreaseBalanceTestNegativeBalanceCurrency(){
        //given
        DebitCard debitCard = new DebitCard("usd", 1000, "Visa");

        //then
        assertThrows(RuntimeException.class, () -> debitCard.decreaseBalance(2000d));
    }

    @Test
    public void decreaseBalanceTestZeroBalance(){
        //given
        DebitCard debitCard = new DebitCard("rub", 1000.15, "Visa");

        //when
         debitCard.decreaseBalance(1000.15d);

         //then
         assertEquals(0d, debitCard.getBalance());
    }

    @Test
    public void decreaseBalanceTestZeroBalanceCurrency(){
        //given
        DebitCard debitCard = new DebitCard("usd", 1000, "Visa");

        //when
        debitCard.decreaseBalance(1000d);

        //then
        assertEquals(0d, debitCard.getBalance());
    }


    @Test
    public void decreaseBalanceTestPositiveBalance(){
        //given
        DebitCard debitCard = new DebitCard("rub", 1000d, "Visa");

        //when
        debitCard.decreaseBalance(999d);

        //then
        assertEquals(1, debitCard.getBalance());
    }

    @Test
    public void incrementBalanceTestPositiveZero(){
        //given
        DebitCard debitCard = new DebitCard("rub", 0d, "Master Card");

        //when
        debitCard.incrementBalance(1d);

        //then
        assertEquals(1d, debitCard.getBalance());
    }

    @Test
    public void incrementBalanceTestPositiveNotZero(){
        //given
        DebitCard debitCard = new DebitCard("rub", 1.50, "Master Card");

        //when
        debitCard.incrementBalance(100);

        //then
        assertEquals(101.50, debitCard.getBalance());
    }

    @Test
    public void incrementBalanceTestNegativeNotZero(){
        //given
        DebitCard debitCard = new DebitCard("rub", 1.49, "Master Card");

        //when
        debitCard.incrementBalance(100);

        //then
        assertNotEquals(101.50, debitCard.getBalance());
    }
    @Test
    public void incrementBalanceTestPositiveZeroCurrency(){
        //given
        DebitCard debitCard = new DebitCard("usd", 0d, "Master Card");

        //when
        debitCard.incrementBalance(1d);

        //then
        assertEquals(1d, debitCard.getBalance());
    }

    @Test
    public void getBalanceTestCurrencyZero(){
        //given
        DebitCard debitCard = new DebitCard("usd", 0d, "Master Card");

        //then
        assertEquals(0d, debitCard.getBalance());
    }

    @Test
    public void getBalanceTestZero(){
        //given
        DebitCard debitCard = new DebitCard("rub", 0d, "Master Card");

        //then
        assertEquals(0d, debitCard.getBalance());
    }

    @Test
    public void getBalanceTestPositiveBalance(){
        //given
        DebitCard debitCard = new DebitCard("rub", 1d, "Master Card");

        //then
        assertEquals(1d, debitCard.getBalance());
    }

    @Test
    public void getBalanceTestPositiveBalanceCurrency(){
        //given
        DebitCard debitCard = new DebitCard("usd", 1d, "Master Card");

        //then
        assertEquals(1d, debitCard.getBalance());
    }
}