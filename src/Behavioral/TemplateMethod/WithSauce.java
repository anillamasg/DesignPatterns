package Behavioral.TemplateMethod;

import java.util.List;

public class WithSauce extends BurgerDecorator{
    public WithSauce(Burger burger) {
        super(burger);
    }

    @Override
    public void addElement() {
        System.out.print("Preparing ");
        List<Sauce> sauces = super.getBurger().getSauces();
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
}