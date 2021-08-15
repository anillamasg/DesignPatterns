package Structural.Bridge;

public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void muteVolume(){
        device.setVolume(0);
        device.volumeInfo();
    }

    public void brightnessUp(){
        ((Tv) device).setBrightness(((Tv) device).getBrightness()+1);
        ((Tv) device).brightnessInfo();
    }

    public void brightnessDown(){
        ((Tv) device).setBrightness(((Tv) device).getBrightness()-1);
        ((Tv) device).brightnessInfo();
    }


}
