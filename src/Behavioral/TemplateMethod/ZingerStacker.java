package Behavioral.TemplateMethod;

import java.util.ArrayList;


// Zinger Stacker consists of buns with veggies, ZINGERFILLET, SUPERCHARGED and CHILLIRELISH sauces, cheese.

public class ZingerStacker extends Burger{
    ZingerStacker() {
        setMeats(new ArrayList<>(){{
            add(Meat.ZINGERFILLET);
        }});
        setSauces(new ArrayList<>(){{
            add(Sauce.SUPERCHARGED);
            add(Sauce.CHILLIRELISH);
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
