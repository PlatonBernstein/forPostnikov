package classes;

import classes.hardware.Frame;
import classes.auxiliaries.Power;
import classes.production.ProductionMarkings;

public class PersonalComputer {

    private ProductionMarkings productionMarkings;
    private Frame frame;
    private Power power;
    private String os;

    /* PersonalComputer(Object Software(*), Object Hardware(*), Object Power(*), Object Frame(*), Object Factory(*), String name)
    */


    public PersonalComputer(Power power, ProductionMarkings productionMarkings, Frame frame, String os) {
        this.frame = frame;
        this.power = power;
        this.productionMarkings = productionMarkings;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Personal computer characteristics: " +
                this.frame.toString() +
                this.power.toString() +
                this.productionMarkings.toString() +
                ", installed OS - " + this.os;
    }


}
