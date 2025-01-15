package dev.andreina.ex__java_cuenta_bancaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GeneralAccountTest {
    @Test
    void testCalculateMonthlyInterest() {
        GeneralAccount generalAccount= new GeneralAccount(8000, 6);
        generalAccount.calculateMonthlyInterest();
        assertEquals(8040, generalAccount.getBalance(), 0.01);
    

    }

    @Test
    void testConsingAmontMoney() {
        GeneralAccount generalAccount= new GeneralAccount(3000, 3);
        generalAccount.consingAmontMoney(2000);
        assertEquals(5000, generalAccount.getBalance());


    }

    @Test
    void testMonthlyStatement() {
        GeneralAccount generalAccount= new GeneralAccount(15000, 4);
        generalAccount.setMonthlyCommission(1000);
        generalAccount.monthlyStatement();
        assertEquals(14050, generalAccount.getBalance(), 0.01);

    }

    @Test
    void testPrintReturnAttributeValues() {
        GeneralAccount generalAccount= new GeneralAccount(7000, 5);
        assertEquals(7000, generalAccount.getBalance());


    }

    @Test
    void testWithdrawAmountMoney() {
        GeneralAccount generalAccount= new GeneralAccount(11000, 5);
        generalAccount.withdrawAmountMoney(2000);
        assertEquals(9000, generalAccount.getBalance(), 0.01);

    }
}
