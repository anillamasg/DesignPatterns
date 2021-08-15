package Structural.Decorator;

public class AlternativeMilkDecorator extends MilkDecorator{
    public AlternativeMilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return coffee.getPrice()+1.5;
    }
}
