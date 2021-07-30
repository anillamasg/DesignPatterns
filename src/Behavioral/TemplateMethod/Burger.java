package Behavioral.TemplateMethod;

import java.util.List;

public abstract class Burger {
    private List<Meat> meats;
    private List<Sauce> sauces;

    public List<Meat> getMeats() {
        return meats;
    }
    public List<Sauce> getSauces() {
        return sauces;
    }
    public void setMeats(List<Meat> meats) {
        this.meats = meats;
    }
    public void setSauces(List<Sauce> sauces) {
        this.sauces = sauces;
    }

    public void prepareEssentials() {
        System.out.println("Preparing Buns.");
        BurgerUtils.sleep(1000);
        System.out.println("Preparing Veggies.");
        BurgerUtils.sleep(1000);
    }

    public abstract Burger prepareTheRest(Burger burger) throws Exception;

    public void assembleBurger() {
        System.out.print("Wrapping it up.");
        int i = 3;
        do {
            System.out.print(".");
            BurgerUtils.sleep(1000);
            i--;
        } while (i > 0);
        System.out.println();
    }

    public void readyBurger() {
        System.out.println("\nYour " + this.getClass().getSimpleName() + " burger is ready. ENJOY!!");
    }

}
