package Decorator;

public class SportsCar extends CarDecorator {
    String content;
    String name = "Sports Car.";
    SportsCar(Car car) {
        super(car);
        this.content = car.getName() + " Adding features of " + name;
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
