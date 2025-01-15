package dev.andreina.ex__java_cuenta_bancaria;

public class GeneralAccount {
    protected float balance;
    protected int consigmentNumber= 0;
    protected int numbersOfDrawals= 0;
    protected float annualRate;
    protected int monthlyCommission= 0;


    //constructor
    public GeneralAccount(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }
    
    
    public float getBalance() {
        return balance;
    }

    
    public float getAnnualRate() {
        return annualRate;
    }


    public int getMonthlyCommission() {
        return monthlyCommission;
    }

    


    public void setMonthlyCommission(int monthlyCommission) {
        this.monthlyCommission = monthlyCommission;
    }


    //method consign amount money
    public void consingAmontMoney(float amount) {
        if (amount>0) {
            balance += amount; // balance= balance + amount
            consigmentNumber ++;
        }

    }

    //method withdraw amount money
    public void withdrawAmountMoney(float amount) {
        if (amount>0 && amount <=balance) {
            balance -= amount; // balance= balance - amount
            numbersOfDrawals++;
        }
    }

    //method calculate monthly interest on account and updating balance
    public void calculateMonthlyInterest () {
        float monthlyInterest= (balance *(annualRate/100)) / 12;
        balance += monthlyInterest;

    }

    //method monthly statement
    public void monthlyStatement() {
        balance -= monthlyCommission;
        calculateMonthlyInterest();
        //balance = Math.round(balance * 100) / 100f; // 100f: redondea saldo final

    }

    public void printReturnAttributeValues() {
        System.out.println("Balance: " + balance);
        System.out.println("Number of consignments: " + consigmentNumber);
        System.out.println("Number of drawals: " + numbersOfDrawals);
        System.out.println("Annual rate: " + annualRate);
        System.out.println("Monthly commission: " + monthlyCommission);
    }
    

}
