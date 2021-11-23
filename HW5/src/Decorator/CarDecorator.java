package Decorator;

public class CarDecorator extends Car implements ICar {
    String content;

    public CarDecorator(Car car){
        content = car.getName() + " Adding features of ";
    }

    @Override
    public String getName() {
        return content;
    }

    @Override
    public void assemble() {
        System.out.println(content);
    }
}
