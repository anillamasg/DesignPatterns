package Behavioral.TemplateMethod;

import java.util.List;

public class WithMeat implements BurgerDecorator{
    private Burger burger;

    public WithMeat(Burger burger) {
        this.burger = burger;
        addElement();
    }

    @Override
    public void addElement() {
        List<Meat> meats = this.burger.getMeats();
        for (Meat m : meats) {
            if (meats.get(meats.size() - 1).equals(m)) {
                System.out.print("Preparing 2 ");
                System.out.print(m);
            } else {
                System.out.print("Preparing 2 ");
                System.out.print(m.toString() + ", ");
            }
        }
        System.out.println(".");
        BurgerUtils.sleep(1000);
    }

    @Override
    public Burger getBurger(){
        return this.burger;
    }
}
