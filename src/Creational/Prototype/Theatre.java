package Creational.Prototype;

public class Theatre implements Clonable {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Theatre(String location) {
        this.location = location;
    }

    public Theatre clone() throws CloneNotSupportedException {
        return (Theatre) super.clone();
    }

}
