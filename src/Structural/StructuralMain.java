package Structural;

import Structural.Bridge.*;

public class StructuralMain {
    public static void main(String[] args) {
        Device device = new Radio();
        RemoteControl remote = new ClassicRemoteControl(device);
        remote.togglePower();
        remote.volumeUp();
        remote.volumeDown();
        remote.channelUp();
        remote.channelDown();
        remote.togglePower();

        System.out.println("\n");

        device = new Tv();
        remote = new AdvancedRemoteControl(device);
        remote.togglePower();
        remote.volumeUp();

        ((AdvancedRemoteControl) remote).brightnessUp();
        ((AdvancedRemoteControl) remote).brightnessDown();
        ((AdvancedRemoteControl) remote).muteVolume();

    }
}

/*
//////////////////////////////////////          ADAPTER DESIGN PATTERN          ////////////////////////////////////////

    Iphone iphone = new Iphone();
    Samsung samsung = new Samsung();

    iphone.charge(new IphoneCharger());
    samsung.charge(new SamsungCharger());

    iphone.charge(new IphoneChargerAdapter(new SamsungCharger()));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


*/
