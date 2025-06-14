package classes.hardware.devices;

import classes.auxiliaries.DevicePowerSource;
import classes.auxiliaries.MouseConnectionType;
import classes.auxiliaries.MouseSensorType;
import classes.auxiliaries.Power;
import classes.hardware.Frame;
import classes.production.ProductionLabel;

public class Mouse {
    private Frame frame;
    private ProductionLabel productionLabel;
    private Power power;
    private DevicePowerSource devicePowerSource;
    private int numberOfButtons;
    private MouseSensorType mouseSensorType;
    private MouseConnectionType mouseConnectionType;

    public Mouse(Frame frame, ProductionLabel productionLabel, Power power, DevicePowerSource devicePowerSource,
                 int numberOfButtons, MouseSensorType mouseSensorType, MouseConnectionType mouseConnectionType) {
        this.frame = frame;
        this.productionLabel = productionLabel;
        this.power = power;
        this.devicePowerSource = devicePowerSource;
        this.numberOfButtons = numberOfButtons;
        this.mouseSensorType = mouseSensorType;
        this.mouseConnectionType = mouseConnectionType;
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

    public MouseSensorType getMouseSensorType() {
        return mouseSensorType;
    }

    public void setMouseSensorType(MouseSensorType mouseSensorType) {
        this.mouseSensorType = mouseSensorType;
    }

    public MouseConnectionType getMouseConnectionType() {
        return mouseConnectionType;
    }

    public void setMouseConnectionType(MouseConnectionType mouseConnectionType) {
        this.mouseConnectionType = mouseConnectionType;
    }

    public DevicePowerSource getDevicePowerSource() {
        return devicePowerSource;
    }

    public void setDevicePowerSource(DevicePowerSource devicePowerSource) {
        this.devicePowerSource = devicePowerSource;
    }

    @Override
    public String toString() {
        return "Mouse characteristics: " +
                this.numberOfButtons +
                this.mouseSensorType +
                this.mouseConnectionType +
                this.frame.toString() +
                this.productionLabel.toString() +
                this.power.toString();
    }
}
