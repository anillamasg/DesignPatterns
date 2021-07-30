package Behavioral.TemplateMethod;

public class WithCheeseFactory extends DecoratorFactory{
    @Override
    public BurgerDecorator getDecorator(Burger burger) {
        return new WithCheese(burger);
    }
}
