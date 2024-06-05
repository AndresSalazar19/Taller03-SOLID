package Taller03_SOLID.secA.srp.good;

public class EmailPrinter {
    private Email email;

    public EmailPrinter(Email email) {
        this.email = email;
    }

    public void printEMail(){
        System.out.println(email.content);
    }


}
