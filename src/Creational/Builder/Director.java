package Creational.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Builder constructSports(){
        builder.setSeats(2);
        builder.setEngineSize(12);
        builder.setTripComputer("Latest Trip Computer");
        builder.setGPS("Google GPS System");
        return builder;
    }

    public Builder constructSUV() {
        builder.setSeats(5);
        builder.setEngineSize(6);
        builder.setTripComputer("SUV Trip Computer");
        builder.setGPS("Apple GPS System");
        return builder;
    }
}
