package code.monitors;
import code.Monitor;

public class TubeMonitor extends Monitor {
    private int numberOfTubes;

    public int getNumberOfTubes() {
        return numberOfTubes;
    }

    public void setNumberOfTubes(int numberOfTubes) {
        this.numberOfTubes = numberOfTubes;
    }

    public TubeMonitor(int height, int width, int numberOfTubes) {
        super(height, width);
        this.numberOfTubes = numberOfTubes;
    }

    @Override
    public String toString() {
        return "code.monitors.TubeMonitor: height " + super.getHeight() + ", width " + super.getWidth() + ", numberOfTubes "
                + this.numberOfTubes;
    }
}
