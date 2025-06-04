package code.monitors;
import code.Monitor;
import java.util.Arrays;

public class ZhKrMonitor extends Monitor {
    private int[] gamma;
    private int colorIndex;
    public ZhKrMonitor(int[] gamma, int colorIndex, int height, int width) {
        super(height, width);
        this.colorIndex = colorIndex;
        this.gamma = gamma;
    }

    public int[] getGamma() {
        return gamma;
    }

    public void setGamma(int[] gamma) {
        this.gamma = gamma;
    }

    public int getColorIndex() {
        return colorIndex;
    }

    public void setColorIndex(int colorIndex) {
        this.colorIndex = colorIndex;
    }

    @Override
    public String toString() {
        return "code.monitors.ZhKrMonitor: height " + super.getHeight() + ", width " + super.getWidth() + ", gamma " +
                Arrays.toString(this.gamma) + ", colorIndex " + this.colorIndex;
    }
}
