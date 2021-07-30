package Behavioral.TemplateMethod;

import java.util.ArrayList;

public class BBQBaconStacker extends Burger{
    public BBQBaconStacker() {
        setMeats(new ArrayList<>(){{
            add(Meat.ORIGINALFILLET);
            add(Meat.BACON);
        }});
        setSauces(new ArrayList<>(){{
            add(Sauce.MAYO);
            add(Sauce.BBQ);
        }});
    }

    @Override
    public Burger prepareTheRest(Burger burger) throws Exception {
        burger = BurgerUtils.getDecorator("WithCheese", burger).getBurger();
        burger = BurgerUtils.getDecorator("WithMeat", burger).getBurger();
        burger = BurgerUtils.getDecorator("WithSauce", burger).getBurger();
        return burger;
    }
}