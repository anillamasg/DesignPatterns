package Structural.Bridge;

public class Device {
    private boolean power = false;
    private int volume=5;
    private int channel=1;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void enable(){
        power = true;
    }

    public void disable(){
        power = false;
    }

    public boolean isEnabled(){
        return power;
    }

    public void volumeInfo(){
        System.out.println("Volume of the "+this.getClass().getSimpleName()+": "+getVolume());
    }

    public void channelInfo(){
        System.out.println("Channel of the "+this.getClass().getSimpleName()+": "+getChannel());
    }

    public void powerInfo(){
        if(power){
            System.out.println("Power of the " + this.getClass().getSimpleName() + ": ON");
            return;
        }
        System.out.println("Power of the "+this.getClass().getSimpleName()+": OFF");
    }


}
