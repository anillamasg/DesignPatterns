package Structural.Bridge;

public class Tv extends Device{
    private int brightness=50;

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public int getBrightness(){
        return brightness;
    }

    public void brightnessInfo(){
        System.out.println("Brightness of the "+this.getClass().getSimpleName()+": "+getBrightness());
    }
}
