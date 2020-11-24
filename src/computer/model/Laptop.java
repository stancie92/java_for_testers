package computer.model;

public class Laptop extends Computer {

    private int levelOfBattery;

    public Laptop(String name, String type, int hdd, int ram, int levelOfBattery) {
        super(name, type, hdd, ram);
        this.levelOfBattery = levelOfBattery;
    }

    @Override
    public void switchOn() {
        System.out.println("Check level of battery");
        if (levelOfBattery > 0) {
            super.switchOn();
        } else {
            System.out.println("Please switch on your laptop to charger");
        }
    }

    public void setBatteryLevel(int newLevel) {
        levelOfBattery = newLevel;
    }
}
