import computer.model.Laptop;
import computer.model.PC;

public class Main {

    public static void main(String[] args) {

        PC homeOfficeComp = new PC("My computer", "HP", 500, 200, true);
        Laptop laptop = new Laptop("My laptop", "Acer", 500, 400, 50);

        homeOfficeComp.switchOn();
        System.out.println(homeOfficeComp.getState());

        homeOfficeComp.showName();
        homeOfficeComp.setStateOfPlugin(true);
        System.out.println(homeOfficeComp.getState());

        System.out.println("");

        laptop.setBatteryLevel(0);

        laptop.switchOn();
        System.out.println(laptop.getState());




    }
}

