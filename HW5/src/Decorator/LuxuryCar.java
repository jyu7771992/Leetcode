package Decorator;

public class LuxuryCar extends CarDecorator{
    String content;
    String name = "Luxury Car.";

    LuxuryCar(Car car){
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
