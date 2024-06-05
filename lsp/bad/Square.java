package Taller03_SOLID.secA.lsp.bad;

public class Square extends Rectangle {

    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(width);
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(height);
        super.setWidth(width);
    }

}