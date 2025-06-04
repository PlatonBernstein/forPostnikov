package computers;

import computers.personalComputers.StaticPC;


public class Main {

    public static void main(String[] args) {
        PersonalComputer personalComputer;
        personalComputer = new PersonalComputer(19.5F, 9.23F, 2018, "acer", 1000, 500, "Windows", "London", "");

        System.out.println(personalComputer.toString());

        personalComputer.turnOn();

        String typeOfCalculation = "деление";
        try {
            System.out.println(personalComputer.makeCalculations(10F, 2, typeOfCalculation));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        personalComputer.writeNotes(0, "Я хочу съесть пельмень");
        System.out.println(personalComputer.readNotes(0));
        personalComputer.writeNotes(0, "Я хочу съесть пельмени");
        System.out.println(personalComputer.readNotes(0));

        StaticPC staticPC;
        staticPC = new StaticPC(19.5F, 9.23F, 2018, "acer", 1000, 500, "Windows", "London", "");

        staticPC.makeNewUpgrade("видеокарта RTX-XXXX");
        staticPC.makeNewUpgrade("процессор Intel-11666");
        staticPC.makeNewUpgrade("монитор с RGB подсветкой");
        System.out.println(staticPC.checkUpgrade(2));
        System.out.println(staticPC);

    }
}

