import computer.model.Computer;
import computer.model.Laptop;
import computer.model.PC;

public class Main {

    public static void main(String[] args) {

        Computer homeOfficeComp = new PC("My computer1", "HP", 500, 200, false);
        Computer homeOfficeComp1 = new PC("My computer2", "HP", 500, 200, false);
        Computer laptop = new Laptop("My laptop1", "Acer", 500, 400, 0);
        Computer laptop1 = new Laptop("My laptop2", "Acer", 500, 400, 0);
        Computer laptop2 = new Laptop("My laptop3", "Acer", 500, 400, 0);

        Computer [] computers = {homeOfficeComp, homeOfficeComp1, laptop, laptop1, laptop2};

        for (Computer computer: computers){
            computer.switchOff();
        }

        System.out.println(homeOfficeComp.volumeUp());
        System.out.println(laptop.volumeUp());
        System.out.println(laptop.volumeUp());
        System.out.println(laptop.volumeUp());
        System.out.println(homeOfficeComp.volumeUp(100));
        System.out.println(laptop.volumeUp(101));

        System.out.println();

        System.out.println(laptop.volumeDown());
        System.out.println(laptop.volumeDown(100));
        System.out.println(laptop.volumeDown());
        System.out.println(laptop.volumeDown());
        System.out.println(homeOfficeComp.volumeDown());
        System.out.println(homeOfficeComp.volumeDown(37));









    }
}

