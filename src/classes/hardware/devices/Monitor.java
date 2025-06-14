package classes.hardware.devices;

import classes.hardware.Frame;
import classes.auxiliaries.Power;
import classes.auxiliaries.Screen;
import classes.production.ProductionLabel;

public class Monitor {
    private Frame frame;
    private ProductionLabel productionLabel;
    private Power power;
    private Screen screen;

    public Monitor(Frame frame, ProductionLabel productionLabel, Power power, Screen screen) {
        this.frame = frame;
        this.productionLabel = productionLabel;
        this.power = power;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Monitor " + this.screen.toString() + "; " + this.frame.toString() + "; " +
                this.productionLabel.toString() + "; " + this.power.toString();
    }
}
