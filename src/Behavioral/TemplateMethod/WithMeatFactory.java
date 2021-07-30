package Behavioral.TemplateMethod;

public class WithMeatFactory extends DecoratorFactory{
    @Override
    public BurgerDecorator getDecorator(Burger burger) {
        return new WithMeat(burger);
    }
}
