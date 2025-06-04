package monitors;

import monitors.monitors.TubeMonitor;
import monitors.monitors.ZhKrMonitor;

public class Main {
    public static void main(String[] args) {

        Monitor[] monitors = new Monitor[3];

        int[] gamma = {300, 300, 300};
        monitors[0] = new ZhKrMonitor(gamma, 100, 2000, 500);
        monitors[1] = new TubeMonitor(1500, 1500, 50);
        monitors[2] = new ZhKrMonitor(gamma, 100, 2000, 500);

        for (Monitor monitor : monitors) {
            System.out.println(monitor.toString());
        }
    }
}
