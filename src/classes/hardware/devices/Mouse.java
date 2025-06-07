package classes.hardware.devices;

import classes.auxiliaries.Power;
import classes.hardware.Frame;
import classes.production.ProductionMarkings;

public class Mouse {
    private Frame frame;
    private ProductionMarkings productionMarkings;
    private Power power;
    private int numberOfButtons;
    private String additionalButtons;
    private String sensorType;
    private int sensorFrequency;

    public Mouse(Frame frame, ProductionMarkings productionMarkings, Power power, int numberOfButtons, String additionalButtons, String sensorType, int sensorFrequency) {
        this.frame = frame;
        this.productionMarkings = productionMarkings;
        this.power = power;
        this.numberOfButtons = numberOfButtons;
        this.additionalButtons = additionalButtons;
        this.sensorType = sensorType;
        this.sensorFrequency = sensorFrequency;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public ProductionMarkings getProductionMarkings() {
        return productionMarkings;
    }

    public void setProductionMarkings(ProductionMarkings productionMarkings) {
        this.productionMarkings = productionMarkings;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    public String getAdditionalButtons() {
        return additionalButtons;
    }

    public void setAdditionalButtons(String additionalButtons) {
        this.additionalButtons = additionalButtons;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public int getSensorFrequency() {
        return sensorFrequency;
    }

    public void setSensorFrequency(int sensorFrequency) {
        this.sensorFrequency = sensorFrequency;
    }

    @Override
    public String toString() {
        return "Mouse characteristics: " +
                this.numberOfButtons +
                this.additionalButtons +
                this.sensorType +
                this.sensorFrequency +
                this.frame.toString() +
                this.productionMarkings.toString() +
                this.power.toString();
    }
}
