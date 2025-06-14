package classes.hardware.devices;

import classes.auxiliaries.PowerSource;
import classes.auxiliaries.ConnectionType;
import classes.auxiliaries.SensorType;
import classes.auxiliaries.Power;
import classes.hardware.Frame;
import classes.production.ProductionLabel;

public class Mouse {
    private Frame frame;
    private ProductionLabel productionLabel;
    private Power power;
    private PowerSource powerSource;
    private int numberOfButtons;
    private SensorType sensorType;
    private ConnectionType connectionType;

    public Mouse(Frame frame, ProductionLabel productionLabel, Power power, PowerSource powerSource,
                 int numberOfButtons, SensorType sensorType, ConnectionType connectionType) {
        this.frame = frame;
        this.productionLabel = productionLabel;
        this.power = power;
        this.powerSource = powerSource;
        this.numberOfButtons = numberOfButtons;
        this.sensorType = sensorType;
        this.connectionType = connectionType;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public ProductionLabel getProductionMarkings() {
        return productionLabel;
    }

    public void setProductionMarkings(ProductionLabel productionLabel) {
        this.productionLabel = productionLabel;
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

    public SensorType getMouseSensorType() {
        return sensorType;
    }

    public void setMouseSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }

    public ConnectionType getMouseConnectionType() {
        return connectionType;
    }

    public void setMouseConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public PowerSource getDevicePowerSource() {
        return powerSource;
    }

    public void setDevicePowerSource(PowerSource powerSource) {
        this.powerSource = powerSource;
    }

    @Override
    public String toString() {
        return "Mouse characteristics: " +
                this.numberOfButtons +
                this.sensorType +
                this.connectionType +
                this.frame.toString() +
                this.productionLabel.toString() +
                this.power.toString();
    }
}
