/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceabstract;

/**
 *
 * @author Inezita
 */
public class InterfaceAbstractInezita {

public static void main(String[] args) {
        AccountInezita acc1 = new AccountInezita("Lendy Elhadi", "12345", 1000);
//        System.out.println(acc1.getBankName());
        acc1.deposit(1000);
        acc1.deposit(1000);
        acc1.print();
        
        CreditAccountInezita acc2 = new CreditAccountInezita("Norman Normandy", "54545", 1000);
//        System.out.println(acc1.getBankName());
        acc2.print();
        
        //polymorphism with instanceof
        System.out.println("\n\n");
        AbstractBankAccountInezita[] listAll = new AbstractBankAccountInezita[5];
        listAll[0] = acc1;
        listAll[1] = acc2;
        listAll[2] = acc1;
        listAll[3] = acc2;
        listAll[4] = acc1;
        
        for(AbstractBankAccountInezita acc : listAll)
            if(acc instanceof AccountInezita)
                System.out.println("akun tabungan");
            else
                System.out.println("akun kredit");
    }
}
  
