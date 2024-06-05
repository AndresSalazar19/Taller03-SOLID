package Taller03_SOLID.secA.ocp.good;

public class House implements Home{

    @Override
    public int calculateRent() {
        return 150;
    }
}
