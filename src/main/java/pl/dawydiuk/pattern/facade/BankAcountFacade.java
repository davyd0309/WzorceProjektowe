package pl.dawydiuk.pattern.facade;

public class BankAcountFacade {



    private int accountNumber;
    private int securityCode;

    AccountBankCheck accountBankCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;

    WelcomeToBank welcomeToBank;


    public BankAcountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;


        welcomeToBank = new WelcomeToBank();
        accountBankCheck = new AccountBankCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();

    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }


    public void withDrawCash(double cashToGet){

        if(accountBankCheck.accountActive(accountNumber) && securityCodeCheck.isCodeCorect(securityCode) && fundsCheck.haveEnoughMoney(cashToGet)){
            System.out.println("Transaction complete\n");
        }else {
            System.out.println("Transaction fail\n");
        }

    }


    public void depositCash(double cashToDeposit){
        if(accountBankCheck.accountActive(accountNumber) && securityCodeCheck.isCodeCorect(securityCode)){
            fundsCheck.makeDeposit(cashToDeposit);
            System.out.println("Transaction complete\n");
        }else {
            System.out.println("Transaction fail\n");
        }
    }

}
