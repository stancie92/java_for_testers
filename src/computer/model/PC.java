package computer.model;

public class PC extends Computer {

    private boolean stateOfPlugin;

    public PC(String name, String type, int hdd, int ram, boolean stateOfPlugin) {
        super(name, type, hdd, ram);
        this.stateOfPlugin = stateOfPlugin;

    }

    public void showName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Check connection to electricity");
        if (stateOfPlugin == true) {
            super.switchOn();
        } else {
            super.switchOff();
            System.out.println("You have no connection to electricity!!!");
        }
    }

    public void setStateOfPlugin(boolean newStateOfPlugin) {
        stateOfPlugin = newStateOfPlugin;
    }

    @Override
    public void switchOff() {
        System.out.println(" Switch off PC: " + name);
        state = false;
    }

    public int volumeUp() {
        return volumeLevel += 1;
    }

    public int volumeDown() {
        volumeLevel -= 1;
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
            return volumeLevel =  0;
        } else {
            return volumeLevel;
        }
    }
}
