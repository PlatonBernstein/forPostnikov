package classes.auxiliaries;

public class Screen {
    private boolean curvedScr;
    private boolean touchScr;
    private boolean supportOfHDR;
    private float displayDiagonal;
    private int[] aspectRatio;
    private String matrixBacklight;
    private String screenCoating;
    private int[] maxResolution;
    private int brightness;
    private int[] contrast;
    private int numberOfColors;
    private int refreshRate;

    public Screen(boolean curvedScr, boolean touchScr, boolean supportOfHDR, float displayDiagonal, int[] aspectRatio,
                  String matrixBacklight, String screenCoating, int brightness, int[] contrast, int numberOfColors,
                  int refreshRate) {
        this.curvedScr = curvedScr;
        this.touchScr = touchScr;
        this.supportOfHDR = supportOfHDR;
        this.displayDiagonal = displayDiagonal;
        this.aspectRatio = aspectRatio;
        this.matrixBacklight = matrixBacklight;
        this.screenCoating = screenCoating;
        this.brightness = brightness;
        this.contrast = contrast;
        this.numberOfColors = numberOfColors;
        this.refreshRate = refreshRate;
    }

    public boolean isCurvedScr() {
        return curvedScr;
    }

    public void setCurvedScr(boolean curvedScr) {
        this.curvedScr = curvedScr;
    }

    public boolean isTouchScr() {
        return touchScr;
    }

    public void setTouchScr(boolean touchScr) {
        this.touchScr = touchScr;
    }

    public boolean isSupportOfHDR() {
        return supportOfHDR;
    }

    public void setSupportOfHDR(boolean supportOfHDR) {
        this.supportOfHDR = supportOfHDR;
    }

    public float getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(float displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public int[] getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(int[] aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getMatrixBacklight() {
        return matrixBacklight;
    }

    public void setMatrixBacklight(String matrixBacklight) {
        this.matrixBacklight = matrixBacklight;
    }

    public int[] getMaxResolution() {
        return maxResolution;
    }

    public void setMaxResolution(int[] maxResolution) {
        this.maxResolution = maxResolution;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int[] getContrast() {
        return contrast;
    }

    public void setContrast(int[] contrast) {
        this.contrast = contrast;
    }

    public int getNumberOfColors() {
        return numberOfColors;
    }

    public void setNumberOfColors(int numberOfColors) {
        this.numberOfColors = numberOfColors;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getScreenCoating() {
        return screenCoating;
    }

    public void setScreenCoating(String screenCoating) {
        this.screenCoating = screenCoating;
    }

    @Override
    public String toString() {
        return "Screen characteristics: diagonal - " + this.displayDiagonal +
                ", aspect ratio - " + this.aspectRatio[0] + ":" + this.aspectRatio[1] +
                ", maximum resolution - " + this.maxResolution[0] + ":" + this.maxResolution[1] +
                ", matrix backlight type - " + this.matrixBacklight +
                ", brightness - " + this.brightness +
                ", contrast - " + this.contrast[0] + ":" + this.contrast[1] +
                ", screen coating type - " + this.screenCoating +
                ", number of colors - " + this.numberOfColors +
                ", refresh rate - " + this.refreshRate +
                ", is screen curved - " + this.curvedScr +
                ", is screen a touchscreen - " + this.touchScr +
                ", does screen support HDR - " + this.supportOfHDR;
    }
}
