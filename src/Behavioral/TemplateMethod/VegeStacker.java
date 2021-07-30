package Behavioral.TemplateMethod;

import java.util.ArrayList;

public class VegeStacker extends Burger{
    public VegeStacker() {
        setSauces(new ArrayList<>(){{
            add(Sauce.AIOLI);
        }});
    }

    @Override
    public Burger prepareTheRest(Burger burger) throws Exception {
        burger = BurgerUtils.getDecorator("WithSauce", burger).getBurger();
        return burger;
    }
}
