package Behavioral.TemplateMethod;

public class KFC {
    public void orderBurger(Burger burger) throws Exception {
        System.out.println("Your ordered a " + burger.getClass().getSimpleName() + ".\n");
        burger.prepareEssentials();
        burger = burger.prepareTheRest(burger);
        burger.assembleBurger();
        burger.readyBurger();
    }
}
