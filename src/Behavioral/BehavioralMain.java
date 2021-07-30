package Behavioral;

import Behavioral.TemplateMethod.BBQBaconStacker;
import Behavioral.TemplateMethod.Burger;
import Behavioral.TemplateMethod.KFC;

public class BehavioralMain {

    public static void main(String[] args) throws Exception {
        Burger burger = new BBQBaconStacker();
//        Burger burger = new ZingerStacker();
//        Burger burger = new DoubleTender();
//        Burger burger = new VegeStacker();
        new KFC().orderBurger(burger);
        System.out.println("THANKS!! SEE YOU AGAIN!!");
    }
}
