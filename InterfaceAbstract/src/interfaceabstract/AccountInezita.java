/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceabstract;

/**
 *
 * @author Inezita
 */

//interface implement
//public class Account implements InterfaceBankAccount {
//    String accountName;
//    String accountNum;
//    int balance;
//
//    public Account(String name, String num){
//        this.accountName = name;
//        this.accountNum = num;
//        balance = 0;
//    }
//}

public class AccountInezita extends AbstractBankAccountInezita {
    private static double bagihasil = 0.1;
    
    public AccountInezita(String name, String num, int amt){
        super(name, num, ((int)AccountInezita.calculateBonus(amt) + amt));
    }
    
    private static double calculateBonus(int amt){
        return bagihasil*amt;
    }
    
    @Override
    public void deposit(int amt) {
        this.balance += amt;
    }

    @Override
    public void withdraw(int amt) {
        this.balance -= amt;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public String getBankName() {
        return this.BANK;
    }
    
    public void print(){
        System.out.println("Bank Name: " + this.getBankName()
                            + "\nAccount Name: " + this.accountName
                            + "\nAccount Number: " + this. accountNum
                            + "\nBalance: " + this.balance);
        System.out.println("\n");
    }
    
}
