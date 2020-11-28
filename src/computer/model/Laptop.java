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

    @Override
    public void switchOff() {
        System.out.println(" Switch off laptop: " + name);
        state = false;
    }

    public int volumeUp() {
        return volumeLevel += 5;
    }

    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            return volumeLevel = 0;
        } else {
            return volumeLevel;
        }


    }

    @Override
    public int volumeUp(int plusLevel) {
        volumeLevel += plusLevel;
        if (volumeLevel >= 100) {
            return volumeLevel = 100;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int minusLevel) {
        volumeLevel -= minusLevel;
        if (volumeLevel <= 0) {
            return volumeLevel = 0;
        } else {
            return volumeLevel;
        }
    }
}

