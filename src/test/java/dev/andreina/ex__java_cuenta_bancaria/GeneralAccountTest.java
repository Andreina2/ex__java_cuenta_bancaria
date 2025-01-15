package dev.andreina.ex__java_cuenta_bancaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GeneralAccountTest {
    @Test
    void testCalculateMonthlyInterest() {
        GeneralAccount generalAccount= new GeneralAccount(3000, 3);
        generalAccount.consingAmontMoney(2000);
        assertEquals(5000, generalAccount.getBalance());

    }

    @Test
    void testConsingAmontMoney() {

    }

    @Test
    void testMonthlyStatement() {

    }

    @Test
    void testPrintReturnAttributeValues() {

    }

    @Test
    void testWithdrawAmountMoney() {

    }
}
