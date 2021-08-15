package Structural.Bridge;

public class RemoteControl {
    // reference to Device i.e. device is the bridge between abstraction(RemoteControl) and implementation(Device).
    protected Device device;

    public RemoteControl(Device device){
        this.device = device;
    }
    public void togglePower(){
        if (device.isEnabled()){
            device.disable();
            return;
        }
        device.enable();
        device.powerInfo();
    }

    public void volumeUp(){
        device.setVolume(device.getVolume()+1);
        device.volumeInfo();
    }

    public void volumeDown(){
        device.setVolume(device.getVolume()-1);
        device.volumeInfo();
    }

    public void channelUp(){
        device.setChannel(device.getChannel()+1);
        device.channelInfo();
    }

    public void channelDown(){
        device.setChannel(device.getChannel()-1);
        device.channelInfo();
    }

}
