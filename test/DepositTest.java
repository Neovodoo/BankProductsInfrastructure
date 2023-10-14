import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositTest {
    @Test
    public void getBalanceTestZero(){
        //given
        Deposit deposit = new Deposit("rub", 0d, "Master Card");

        //then
        assertEquals(0d, deposit.getBalance());
    }

    @Test
    public void getBalanceTestPositiveBalance(){
        //given
        Deposit deposit = new Deposit("rub", 1d, "Master Card");

        //then
        assertEquals(1d, deposit.getBalance());
    }

    @Test
    public void closeTest(){
        //given
        Deposit deposit = new Deposit("rub", 1d, "Master Card");

        //when
        deposit.close();

        //then
        assertEquals(false, deposit.isDepositOpen);
    }

    @Test
    public void incrementBalanceTestPositiveZero(){
        //given
        Deposit deposit = new Deposit("rub", 0d, "Master Card");

        //when
        deposit.incrementBalance(1d);

        //then
        assertEquals(1d, deposit.getBalance());
    }

    @Test
    public void incrementBalanceTestPositiveNotZero(){
        //given
        Deposit deposit = new Deposit("rub", 1d, "Master Card");

        //when
        deposit.incrementBalance(0.1d);

        //then
        assertEquals(1.1d, deposit.getBalance());
    }

    @Test
    public void incrementBalanceTestCloseDeposit(){
        //given
        Deposit deposit = new Deposit("rub", 1d, "Master Card");
        deposit.close();

        //then
        assertThrows(RuntimeException.class, () -> deposit.incrementBalance(1d));
    }
}