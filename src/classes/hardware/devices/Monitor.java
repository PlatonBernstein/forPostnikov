package classes.hardware.devices;

import classes.hardware.Frame;
import classes.auxiliaries.Power;
import classes.auxiliaries.Screen;
import classes.production.ProductionMarkings;

public class Monitor {
    private Frame frame;
    private ProductionMarkings productionMarkings;
    private Power power;
    private Screen screen;

    public Monitor(Frame frame, ProductionMarkings productionMarkings, Power power, Screen screen) {
        this.frame = frame;
        this.productionMarkings = productionMarkings;
        this.power = power;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Monitor " + this.screen.toString() + "; " + this.frame.toString() + "; " +
                this.productionMarkings.toString() + "; " + this.power.toString();
    }

}
