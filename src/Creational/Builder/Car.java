package Creational.Builder;

public class Car {
    private int seats;
    private int engineSize;
    private String tripComputer;
    private String gps;

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engineSize=" + engineSize +
                ", tripComputer='" + tripComputer + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }

    public static class CarBuilder implements Builder {
        private Car car;

        public CarBuilder() {
            this.car = new Car();
        }

        @Override
        public void setSeats(int number) {
            car.seats = number;
        }

        @Override
        public void setEngineSize(int engineSize) {
            car.engineSize = engineSize;
        }

        @Override
        public void setTripComputer(String tripComputer) {
            car.tripComputer = tripComputer;
        }

        @Override
        public void setGPS(String gps) {
            car.gps = gps;
        }

        public Car getProduct(){
            return this.car;
        }
    }

}
