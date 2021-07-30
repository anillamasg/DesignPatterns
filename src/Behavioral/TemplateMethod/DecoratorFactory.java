package Behavioral.TemplateMethod;

public abstract class DecoratorFactory {
    public abstract BurgerDecorator getDecorator(Burger burger);

    public static DecoratorFactory getDecoratorFactory(String type) throws Exception {
        return (DecoratorFactory) Class.forName("Behavioral.TemplateMethod."+type+"Factory").getDeclaredConstructor().newInstance();
    }

}