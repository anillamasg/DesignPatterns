package Creational.Builder;

public class CarManual {
    private String seats;
    private String engine;
    private String tripComputer;
    private String gps;

    @Override
    public String toString() {
        return "CarManual{" +
                "seats='" + seats + '\'' +
                ", engine='" + engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }

    public static class CarManualBuilder implements Builder{
        private CarManual carManual;

        public CarManualBuilder(){
            this.carManual = new CarManual();
        }

        @Override
        public void setSeats(int number) {
            carManual.seats = number + " seats is placed.";
        }

        @Override
        public void setEngineSize(int engine) {
            carManual.engine = engine + " size engine is placed.";
        }

        @Override
        public void setTripComputer(String tripComputer) {
            carManual.tripComputer = tripComputer + " is installed on the dashboard.";
        }

        @Override
        public void setGPS(String gps) {
            carManual.gps = gps + "is also available for navigation.";
        }

        public CarManual getProduct(){
            return this.carManual;
        }
    }
}
