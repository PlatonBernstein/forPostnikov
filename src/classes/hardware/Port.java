package classes.hardware;

public class Port {
    private String name;
    private String orientation;
    private int numberOf;


    public Port(String name, String orientation, int numberOf) {
        this.name = name;
        this.orientation = orientation;
        this.numberOf = numberOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }

    @Override
    public String toString() {
        return "This port characteristics: name of port - " + this.name +
                ", port orientation - " + this.orientation +
                ", number of such port in one place - " + this.numberOf;
    }
}
