package computers;

public class PersonalComputer extends ElectronicDevice {

    private int height;
    private int width;
    private final String OS;
    private String PCLocation;
    private String userLocation;

    private String[] Notes = new String[100];
    private int numNote;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public String getPCLocation() {
        return PCLocation;
    }
    public void setPCLocation(String PCLocation) {
        this.PCLocation = PCLocation;
    }
    public String getUserLocation() {
        return userLocation;
    }
    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public PersonalComputer(float voltage, float amperage, int yearOfProduction, String factory, int height, int width, String OS, String PCLocation, String userLocation) {
        super(voltage, amperage, yearOfProduction, factory);
        this.height = height;
        this.width = width;
        this.OS = OS;
        this.PCLocation = PCLocation;
        this.userLocation = userLocation;
    }

    public void writeNotes(int numNote, String text) {
        try {
            this.Notes[numNote] = text;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: такого индекса записи не существует");
        }
    }

    public String readNotes(int numNote) {
        try {
            return Notes[numNote];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: такого индекса записи не существует");
            return "";
        }
    }

    public double makeCalculations(float a, float b, String typeOfCalculation) throws Exception {
        if (!this.isDeviceStatus()) {
            throw new Exception("Ошибка: устройство не включено");
        }
        switch (typeOfCalculation.toLowerCase()) {
            case "деление":
                if (b != 0) return a / b;
                else throw new Exception("Ошибка: деление на ноль");
            case "сложение":
                return a + b;
            case "вычитание":
                return a - b;
            case "умножение":
                return a * b;
            default:
                throw new Exception("Ошибка: ввод несуществующего типа вычисления");
        }
    }

    public void provideMaintenance() {
        if (!this.isDeviceStatus()) {
            System.out.println("Персональный компьютер успешно обслужен");
        }
        else {
            System.out.println("Компьютер включён, обслуживание невозможно");
        }
    }

    @Override
    public void turnOn() {
        setDeviceStatus(true);
    }

    @Override
    public void turnOff() {
        setDeviceStatus(false);
    }

    @Override
    public String toString() {
        return "Personal computer" + super.toString() + ", monitor height - " + this.height + ", monitor width - " +
                this.width + ", installed OS - " + this.OS;
    }


}
