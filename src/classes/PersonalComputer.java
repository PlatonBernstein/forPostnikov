package classes;

import classes.hardware.Frame;
import classes.auxiliaries.Power;
import classes.production.ProductionLabel;

public class PersonalComputer {
    private ProductionLabel productionLabel;
    private Frame frame;
    private Power power;
    private String os;

    /* PersonalComputer(Object Software(*), Object Hardware(*), Object Power(*), Object Frame(*), Object Factory(*), String name)
    */

    public PersonalComputer(Power power, ProductionLabel productionLabel, Frame frame, String os) {
        this.frame = frame;
        this.power = power;
        this.productionLabel = productionLabel;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Personal computer characteristics: " +
                this.frame.toString() +
                this.power.toString() +
                this.productionLabel.toString() +
                ", installed OS - " + this.os;
    }
}
