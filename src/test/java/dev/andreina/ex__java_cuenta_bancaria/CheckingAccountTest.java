package dev.andreina.ex__java_cuenta_bancaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CheckingAccountTest {
    @Test
    void testConsingAmontMoney() {
        CheckingAccount checkingAccount = new CheckingAccount(12000, 3);
        checkingAccount.consingAmontMoney(4000);
        assertEquals(16000, checkingAccount.getBalance());

    }

    @Test
    void testPrintReturnAttributeValues() {
        CheckingAccount checkingAccount= new CheckingAccount(5000, 4);
        assertEquals(5000, checkingAccount.getBalance());
        assertEquals(4, checkingAccount.getAnnualRate());

    }

    @Test
    void testWithdrawAmountMoney() {
        CheckingAccount checkingAccount= new CheckingAccount(11000, 5);
        checkingAccount.withdrawAmountMoney(2000);
        assertEquals(9000, checkingAccount.getBalance(), 0.01);


    }
}
