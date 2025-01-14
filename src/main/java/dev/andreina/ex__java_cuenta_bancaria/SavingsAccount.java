package dev.andreina.ex__java_cuenta_bancaria;

// SavingsAccount extends GeneralAccount : General Account tiene de hija a SavingsAccount
class SavingsAccount extends GeneralAccount{
    private boolean countActive;

    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate); // Llama al constructor de la clase padre (GeneralAccount), pasando el saldo y la tasa anual.
        updateAccountStatus();
    }

    private void updateAccountStatus() {
        countActive= balance>= 10000;
    }

    @Override
    public void consingAmontMoney(float amount) {
        if(countActive) {
            super.consingAmontMoney(amount);
        }

        updateAccountStatus();
    }

    @Override
    public void withdrawAmountMoney(float amount) {
        if(countActive) {
            super.withdrawAmountMoney(amount);
        }
        updateAccountStatus();
    }

    @Override
    public void monthlyStatement() {
        if(numbersOfDrawals >=4) {
            monthlyCommission += (numbersOfDrawals - 4) * 10000;
        }

        super.monthlyStatement();
        updateAccountStatus();
    }

    @Override
    public void printReturnAttributeValues() {
        super.printReturnAttributeValues();
        System.out.println("Account Status: " + (countActive ? "Active" : "Inactive" ));
    }

    // cantidad de operaciones realizadas
    int totalTransactions = consigmentNumber + numbersOfDrawals;
    System.out.println("Total transactions: " + totalTransactions);
    

}