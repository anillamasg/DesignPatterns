package Structural.Adapter;

public class Iphone {
    public void charge(IphoneCharger charger){
        charger.useLighting();
        System.out.println(charger.getClass().getSimpleName()+" is charging the "+this.getClass().getSimpleName());
    }
}
