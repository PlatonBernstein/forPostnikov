package classes.hardware;

public class Port {
    private String type;
    private String orientation;
    private int numberOf;


    public Port(String name, String orientation, int numberOf) {
        this.type = name;
        this.orientation = orientation;
        this.numberOf = numberOf;
    }

    public String getName() {
        return type;
    }

    public void setName(String name) {
        this.type = name;
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
        return "This port characteristics: name of port - " + this.type +
                ", port orientation - " + this.orientation +
                ", number of such port in one place - " + this.numberOf;
    }
}
