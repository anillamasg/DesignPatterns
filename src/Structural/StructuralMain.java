package Structural;

import Structural.Adapter.*;

public class StructuralMain {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();

        iphone.charge(new IphoneCharger());
        samsung.charge(new SamsungCharger());

        iphone.charge(new IphoneChargerAdapter(new SamsungCharger()));
    }
}
