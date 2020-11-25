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
}
