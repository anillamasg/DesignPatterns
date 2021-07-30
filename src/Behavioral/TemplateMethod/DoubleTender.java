package Behavioral.TemplateMethod;

import java.util.ArrayList;

public class DoubleTender extends Burger{
    DoubleTender() {
        setMeats(new ArrayList<>(){{
            add(Meat.TENDER);
        }});
        setSauces(new ArrayList<>(){{
            add(Sauce.PEPPERMAYO);
        }});
    }

    @Override
    public Burger prepareTheRest(Burger burger) throws Exception {
        burger = BurgerUtils.getDecorator("WithMeat", burger).getBurger();
        burger = BurgerUtils.getDecorator("WithSauce", burger).getBurger();
        return burger;
    }
}
