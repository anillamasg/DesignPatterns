package Structural.Adapter;

public class Samsung {
    public void charge(SamsungCharger charger){
        charger.usingTypeC();
        System.out.println(charger.getClass().getSimpleName()+" is charging the "+this.getClass().getSimpleName());
    }
}
