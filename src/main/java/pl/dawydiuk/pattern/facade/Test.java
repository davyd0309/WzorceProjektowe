package pl.dawydiuk.pattern.facade;

public class Test {


    public static void main(String[] args) {

        BankAcountFacade accessingBank = new BankAcountFacade(1566548555,1234);
        accessingBank.withDrawCash(50);
        accessingBank.withDrawCash(70);
        accessingBank.depositCash(120);



    }

}
