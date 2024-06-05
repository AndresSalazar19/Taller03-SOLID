package Taller03_SOLID.secA.ocp.good;

public class Rent {
    public Home home;

    public Rent(Home home) {
        this.home = home;
    }

    public int calculateRent() {
        return home.calculateRent();
    }
}
