package pl.dawydiuk.pattern.facade;

public class AccountBankCheck {


    private int accountNumber = 1566548555;

    public int getAccountNumber() {
        return accountNumber;
    }


    public boolean accountActive(int accountNumberToCheck){
        return accountNumberToCheck == getAccountNumber();
    }
}
