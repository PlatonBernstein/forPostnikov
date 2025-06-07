package classes.auxiliaries;

public class Power {
    private float voltageActive;
    private float voltageSleep;
    private float voltageInActive;

    public Power(float voltageActive, float voltageSleep, float voltageInActive) {
        this.voltageActive = voltageActive;
        this.voltageSleep = voltageSleep;
        this.voltageInActive = voltageInActive;
    }

    public float getVoltageActive() {
        return voltageActive;
    }

    public void setVoltageActive(float voltageActive) {
        this.voltageActive = voltageActive;
    }

    public float getVoltageSleep() {
        return voltageSleep;
    }

    public void setVoltageSleep(float voltageSleep) {
        this.voltageSleep = voltageSleep;
    }

    public float getVoltageInActive() {
        return voltageInActive;
    }

    public void setVoltageInActive(float voltageInActive) {
        this.voltageInActive = voltageInActive;
    }

    @Override
    public String toString() {
        return  "power characteristics: voltage in active mode - " + this.voltageActive +
                ", voltage in sleep mode - " + this.voltageSleep +
                ", voltage when device is turned off - " + this.voltageInActive;
    }
}
