package Taller03_SOLID.secA.isp.bad;

public class ElectricCar implements Car {

    @Override
    public void refillFuel() {
        throw new UnsupportedOperationException("Electric cars don't have fuel!");
    }

    @Override
    public void removeFuel() {
        throw new UnsupportedOperationException("Electric cars don't have fuel!");
    }

    @Override
    public void changeTires() {
    }

}
