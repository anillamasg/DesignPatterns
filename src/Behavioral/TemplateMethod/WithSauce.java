package Behavioral.TemplateMethod;

import java.util.List;

public class WithSauce implements BurgerDecorator{
    private Burger burger;

    public WithSauce(Burger burger) {
        this.burger = burger;
        addElement();
    }

    @Override
    public void addElement() {
        System.out.print("Preparing ");
        List<Sauce> sauces = this.burger.getSauces();
        for (Sauce s : sauces) {
            if (sauces.get(sauces.size() - 1).equals(s)) {
                System.out.print(s);
            } else {
                System.out.print(s.toString() + ", ");
            }
        }
        System.out.println(" sauces.");
        BurgerUtils.sleep(1000);
    }

    @Override
    public Burger getBurger(){
        return this.burger;
    }
}