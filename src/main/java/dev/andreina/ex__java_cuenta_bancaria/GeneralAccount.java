package dev.andreina.ex__java_cuenta_bancaria;

public class GeneralAccount {
    protected float balance;
    protected int consigmentNumber= 0;
    protected int numbersOfDrawals= 0;
    protected float annuaRate;
    protected int monthlyCommission= 0;



    public GeneralAccount(float balance, float annuaRate) {
        this.balance = balance;
        this.annuaRate = annuaRate;
    }
    

}
