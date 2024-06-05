package Taller03_SOLID.secA.ocp.bad;

public class Rent {
    public Home home;

    public Rent(Home home) {
        this.home = home;
    }

    public int calculateRent() {
        switch (home.homeType) {
            case HOUSE:
                return 150;
            case DEPARTMENT:
                return 200;
            default:
                return 0;
        }
    }
}
