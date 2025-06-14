package classes.auxiliaries;

public class Size {
    private int width;
    private int height;
    private int length;
    private String shape;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Size(int length, int height, int width, String shape) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "dimensions are: length - " + this.length +
                ", height - " + this.height +
                ", width - " + this.width +
                ", shape of object is - " + this.shape;
    }
}
