package computers.personalComputers;

import computers.PersonalComputer;

public class Laptop extends PersonalComputer {

    private int batteryLifetime;

    public Laptop(float voltage, float amperage, int yearOfProduction, String factory, int height, int width, String OS,
                  String PCLocation, String userLocation, int batteryLifetime) {
        super(voltage, amperage, yearOfProduction, factory, height, width, OS, PCLocation, userLocation);
        this.batteryLifetime = batteryLifetime;
    }

    public void getOnVacation() {
        System.out.println("Вы берёте ноутбук с собой в отпуск!");
    }

    public int getBatteryLifetime() {
        return batteryLifetime;
    }

    public void setBatteryLifetime(int batteryLifetime) {
        this.batteryLifetime = batteryLifetime;
    }

    @Override
    public String toString() {
        return "Laptop " + super.toString().substring(17) + ", battery lifetime - " + this.batteryLifetime;
    }


}
