package Behavioral.TemplateMethod;

public abstract class BurgerDecorator{
    private Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
        addElement();
    }

    public abstract void addElement();
    public Burger getBurger(){
        return burger;
    }
}
