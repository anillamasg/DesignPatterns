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












/*
public class WithCheese extends BurgerDecorator{
    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    private Burger burger;

    @Override
    protected Burger prepareTheRest(Burger burger) {
        return null;
    }

    public WithCheese(Burger burger) {
        this.burger = burger;
        addElement();
    }

    @Override
    protected void addElement() {
        System.out.println("Preparing a Slice of Cheese.");
        BurgerUtils.sleep(1000);
    }

    @Override
    Burger getBurger() {
        return this.burger;
    }
}
*/
