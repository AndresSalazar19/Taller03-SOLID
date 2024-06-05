package Taller03_SOLID.secA.lsp.good;

public class Square implements Shape {
    int sideLenght;

    public Square(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    public void setSideLenght(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public int getArea() {
        return sideLenght * sideLenght;
    }

}