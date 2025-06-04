package code;

import code.monitors.TubeMonitor;
import code.monitors.ZhKrMonitor;

public class Main {
    public static void main(String[] args) {

        Monitor[] monitors = new Monitor[3];

        int[] gamma = {300, 300, 300};
        monitors[0] = new ZhKrMonitor(gamma, 100, 2000, 500);
        monitors[1] = new TubeMonitor(1500, 1500, 50);
        monitors[2] = new ZhKrMonitor(gamma, 100, 2000, 500);

        for (int i = 0; i < monitors.length; i++) {
            Monitor monitor = monitors[i];
            System.out.println(monitor.toString());
        }
    }
}
