package MonitorProject;

public class Monitor {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Monitor(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "code.Monitor: height " + this.height + ", width " + this.width;
    }

}
