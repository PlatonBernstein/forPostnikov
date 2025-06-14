package classes.auxiliaries;

public class Power {
    private float voltage;
    private float powerActive;
    private float powerSleep;
    private float powerInactive;

    public Power(float voltage, float powerActive, float powerSleep, float powerInactive) {
        this.voltage = voltage;
        this.powerActive = powerActive;
        this.powerSleep = powerSleep;
        this.powerInactive = powerInactive;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public float getPowerActive() {
        return powerActive;
    }

    public void setPowerActive(float powerActive) {
        this.powerActive = powerActive;
    }

    public float getPowerSleep() {
        return powerSleep;
    }

    public void setPowerSleep(float powerSleep) {
        this.powerSleep = powerSleep;
    }

    public float getPowerInactive() {
        return powerInactive;
    }

    public void setPowerInactive(float powerInactive) {
        this.powerInactive = powerInactive;
    }

    @Override
    public String toString() {
        return  "power characteristics: voltage " + this.voltage +
                ", power in active mode - " + this.powerActive +
                ", power in sleep mode - " + this.powerSleep +
                ", power when device is turned off - " + this.powerInactive;
    }
}
