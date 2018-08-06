package pl.dawydiuk.pattern.facade;

public class SecurityCodeCheck {


    private int securityCode = 1234;


    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorect(int secCodeToCheck){
        return secCodeToCheck == getSecurityCode();
    }
}
