package ferrari;

public class Ferrari implements Car {
    private static final String CAR_MODEL = "488-Spider";
    private String driverName;
    private String carModel;

    public Ferrari(String driverName) {
        this.driverName = driverName;
        this.carModel = CAR_MODEL;
    }

    @Override
    public String  useBreaks() {
        return "Brakes!";
    }

    @Override
    public String pushTheGasPedal() {
        return "Zadu6avam sA!";
    }

    public String getDriverName() {
        return this.driverName;
    }

    public String getCarModel() {
        return this.carModel;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
                this.getCarModel(), this.useBreaks(), this.pushTheGasPedal(), this.getDriverName());
    }
}
