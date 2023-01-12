package banksederhana;

/**
 * @author Anang Misbakhul Khoir
 * nim 09040620047
 */

public class BankSederhana {

    void bankSederhana1(){
        int accountNumber = 20;
        int accountBalance =  100;
        accountBalance = accountBalance + 100;
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Account Balance = " + accountBalance);
    }
    void bankSederhana2(){
        int accountNumber = 20;
        int accountBalance =  100;
        accountBalance = accountBalance - 50;
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Account Balance = " + accountBalance);
    }
    
    public static void main(String[] args) {
        BankSederhana Bank = new BankSederhana();
        Bank.bankSederhana1();
        Bank.bankSederhana2();
    }
    
}
