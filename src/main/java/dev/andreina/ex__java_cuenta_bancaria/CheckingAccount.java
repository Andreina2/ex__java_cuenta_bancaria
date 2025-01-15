package dev.andreina.ex__java_cuenta_bancaria;

class CheckingAccount extends GeneralAccount{
    private int overdraft= 0;

    public CheckingAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    public void withdrawAmountMoney(float amount) {
        if (amount > balance) {
            overdraft += (amount - balance);
            balance= 0;
        }
        else {
            balance -= amount;
        }
        numbersOfDrawals ++; // actualizo
    }

    @Override
    public void consingAmontMoney (float amount) {
        if(overdraft > 0) {
            if(amount >= overdraft) {
                balance += (amount - overdraft);
                overdraft = 0;
            }
            else {
                overdraft -= amount;
            }
        }
        else
            {
                super.consingAmontMoney(amount);
            }
        }

        @Override
        public void printReturnAttributeValues() {
            super.printReturnAttributeValues();
            System.out.println("You have an overdraft in your account of: " + overdraft);
        }
    }





