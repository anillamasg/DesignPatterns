package Behavioral.TemplateMethod;

import java.util.List;

public class WithMeat extends BurgerDecorator{
    public WithMeat(Burger burger) {
        super(burger);
    }

    @Override
    public void addElement() {
        List<Meat> meats = super.getBurger().getMeats();
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
}
