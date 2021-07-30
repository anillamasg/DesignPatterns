package Behavioral.TemplateMethod;

public class BurgerUtils {
    public static void sleep(int x) {
        try {
            Thread.sleep(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static BurgerDecorator getDecorator(String type, Burger burger) throws Exception {
        DecoratorFactory decoratorFactory = DecoratorFactory.getDecoratorFactory(type);
        return decoratorFactory.getDecorator(burger);
    }

}
