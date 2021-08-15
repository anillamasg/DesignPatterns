package Structural.Decorator;

public class SyrupDecorator extends CoffeeDecorator{
    public SyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return coffee.getPrice()+0.5;
    }
}
