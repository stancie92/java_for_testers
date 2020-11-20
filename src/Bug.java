public class Bug {


    String description;
    String adressEmail;
    int piority;
    boolean statusOfFindedBug;

    Bug(String description, String adressEmail, int piority) {
        this.description = description;
        this.adressEmail = adressEmail;
        this.piority = piority;
        this.statusOfFindedBug = isStatusOfFindedBug();

    }

    boolean isStatusOfFindedBug() {
        return true;


    }

    String convertStatusOfBug() {
        if (isStatusOfFindedBug() == true) {
            return "opened";
        } else {
            return "closed";
        }
    }

    void getInformationAboutBug() {
        System.out.println("All information about bugs: Description: " + description + ", Email of person who created: " + adressEmail + ", Piority: " + piority + " and Status of bugs: " + convertStatusOfBug() + ".");
    }

    void getEmailOfAuthor() {
        System.out.println("Adress email of person who is author of bug: " + adressEmail + ".");
    }

    void getPiority() {
        System.out.println("Piority of your bug: " + piority + ".");

    }

    void getStatus() {
        System.out.println("Your bug is " + convertStatusOfBug() + ".");
    }


}
