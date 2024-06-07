package Taller03_SOLID.secA.srp.bad;

public class Email {
    String content;

    public Email(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void printEMail() {
        System.out.println(content);
    }

}
