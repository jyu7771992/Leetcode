package Q1;

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(int side) {
        super("", "");
        this.width = side;
        this.height = side;
    }

    public Rectangle(int width, int height) {
        super("", "");
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, String color, int width, int height){

        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

    @Override
    public int getArea() {
        return this.width * this.height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
