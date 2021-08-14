package Structural.Adapter;

public class IphoneChargerAdapter extends IphoneCharger{
    private SamsungCharger charger;

    public IphoneChargerAdapter(SamsungCharger charger) {
        this.charger = charger;
    }

    @Override
    public void useLighting() {
        charger.usingTypeC();
    }
}
