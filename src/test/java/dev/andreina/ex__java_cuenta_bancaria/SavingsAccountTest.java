package dev.andreina.ex__java_cuenta_bancaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SavingsAccountTest {
    @Test
    void testConsingAmontMoney() {
        SavingsAccount savingsAccount= new SavingsAccount(10000, 5);
        savingsAccount.consingAmontMoney(5000);
        assertEquals(15000, savingsAccount.getBalance());


    }

    @Test
    void testMonthlyStatement() {
        SavingsAccount savingsAccount= new SavingsAccount(11000, 5);
        savingsAccount.withdrawAmountMoney(2000);
        savingsAccount.setMonthlyCommission(0);
        savingsAccount.monthlyStatement();
        assertEquals(9037.5, savingsAccount.getBalance(), 0.01);


    }

    @Test
    void testPrintReturnAttributeValues() {

    }

    @Test
    void testWithdrawAmountMoney() {
        SavingsAccount savingsAccount= new SavingsAccount(11000, 5);
        savingsAccount.withdrawAmountMoney(2000);
        assertEquals(9000, savingsAccount.getBalance(), 0.01);

    }
}
