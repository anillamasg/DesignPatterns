package Behavioral.TemplateMethod;

public class WithSauceFactory extends DecoratorFactory{
    @Override
    public BurgerDecorator getDecorator(Burger burger) {
        return new WithSauce(burger);
    }
}
