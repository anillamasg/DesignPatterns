package Behavioral.TemplateMethod;

public class WithCheese extends BurgerDecorator {
    public WithCheese(Burger burger) {
        super(burger);
    }

    @Override
    public void addElement() {
        System.out.println("Preparing a Slice of Cheese.");
        BurgerUtils.sleep(1000);
    }
}