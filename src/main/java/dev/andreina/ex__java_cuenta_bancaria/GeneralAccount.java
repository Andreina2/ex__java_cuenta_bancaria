package dev.andreina.ex__java_cuenta_bancaria;

public class GeneralAccount {
    protected float balance;
    protected int consigmentNumber= 0;
    protected int numbersOfDrawals= 0;
    protected float annuaRate;
    protected int monthlyCommission= 0;


    //constructor
    public GeneralAccount(float balance, float annuaRate) {
        this.balance = balance;
        this.annuaRate = annuaRate;
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
    

}
