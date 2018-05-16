package pl.dawydiuk.pattern.reflection;

public class Volvo implements Car{


    private String idCode = "100";

    private String getPrivate(){
        return "How did you get this";
    }


    private String getOtherPrivate(int thisInt,String thatString){
        return "How did you get here "+ thisInt+" "+thatString;
    }


    public Volvo(int number,String randString) {

        System.out.println("You sent: "+number+" "+randString);
    }

    public String displayCarInfo() {
        return null;
    }
}
