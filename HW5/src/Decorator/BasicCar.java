package Decorator;

public class BasicCar extends Car implements ICar {
    String content;

    BasicCar(){
        this.content = "Basic Car.";
    }

    @Override
    public void assemble() {
        System.out.println(content);
    }

    @Override
    public String getName() {
        return content;
    }

}
