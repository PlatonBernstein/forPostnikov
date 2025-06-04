package PersonalComputerProject.personalComputers;

import PersonalComputerProject.PersonalComputer;

import java.util.Arrays;
import java.util.Objects;

public class StaticPC extends PersonalComputer {

    private int numOfUpgrade = 0;
    private final String[] upgrades = new String[5];

    public StaticPC(float voltage, float amperage, int yearOfProduction, String factory, int height, int width,
                    String OS, String PCLocation, String userLocation) {
        super(voltage, amperage, yearOfProduction, factory, height, width, OS, PCLocation, userLocation);
    }

    private boolean checkLocations() {
        if (Objects.equals(this.getUserLocation(), this.getPCLocation())) {
            return true;
        }
        else {
            System.out.println("Стационарный ПК не находится в радиусе пользования");
            return false;
        }
    }

    public void makeNewUpgrade(String newUpgrade) {
        try {
            this.upgrades[this.numOfUpgrade] = newUpgrade;
            this.numOfUpgrade++;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: такого номера апгрейда не существует");
        }

    }

    public String checkUpgrade(int numOfUpgrade) {
        try {
            return this.upgrades[numOfUpgrade];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: такого номера апргейда не существует");
            return "";
        }
    }

    @Override
    public void setUserLocation(String userLocation) {
        super.setUserLocation(userLocation);
        if (!this.checkLocations()) this.turnOff();
    }

    @Override
    public void setPCLocation(String PCLocation) {
        super.setPCLocation(PCLocation);
        if (!this.checkLocations()) this.turnOff();
    }

    @Override
    public void turnOn() {
        if (checkLocations()) {
            setDeviceStatus(true);
        }
    }

    @Override
    public String toString() {
        return "Static PC " + super.toString().substring(17) + ", number of upgrades - " +
                Arrays.stream(upgrades).filter(Objects::nonNull).count();
    }
}

