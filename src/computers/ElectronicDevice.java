package computers;

public abstract class ElectronicDevice {
    private boolean deviceStatus = false;
    private float voltage;
    private float amperage;
    private int yearOfProduction;
    private String factory;

    public ElectronicDevice(float voltage, float amperage, int yearOfProduction, String factory) {
        this.voltage = voltage;
        this.amperage = amperage;
        this.yearOfProduction = yearOfProduction;
        this.factory = factory;
    }

    public boolean isDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(boolean deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public float getAmperage() {
        return amperage;
    }

    public void setAmperage(float amperage) {
        this.amperage = amperage;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return  "characteristics: voltage - " + this.voltage + ", amperage - " + this.amperage +
                ", year of production - " + this.yearOfProduction + ", factory - " + this.factory;
    }
}
