package Other;

public class Bug {


    private String description;
    private String adressEmail;
    private int piority;
    private boolean statusOfFindedBug;

    public Bug(String description, String adressEmail, int piority) {
        this.description = description;
        this.adressEmail = adressEmail;
        this.piority = piority;
        this.statusOfFindedBug = isStatusOfFindedBug();

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() < 10) {
            System.out.println("Your decription is too short. Enter min. 10 letters");

        } else {
            this.description = description;
        }
    }

    public String getAdressEmail() {
        return adressEmail;
    }

    public void setAdressEmail(String adressEmail) {
        if (!adressEmail.contains("@")) {
            System.out.println("Enter incorrect adress email");
        } else {
            this.adressEmail = adressEmail;
        }
    }

    public void setPiority(int piority) {
        if (piority < 1 || piority > 5) {
            System.out.println("Value of piority must be from range 1 - 5.");
        } else {
            this.piority = piority;
        }
    }

    public void setStatusOfFindedBug(boolean statusOfFindedBug) {
        this.statusOfFindedBug = statusOfFindedBug;
    }

    public boolean isStatusOfFindedBug() {
        return true;


    }

    public String convertStatusOfBug() {
        if (isStatusOfFindedBug() == true) {
            return "opened";
        } else {
            return "closed";
        }
    }

    public void getInformationAboutBug() {
        System.out.println("All information about bugs: Description: " + description + ", Email of person who created: " + adressEmail + ", Piority: " + piority + " and Status of bugs: " + convertStatusOfBug() + ".");
    }

    public void getEmailOfAuthor() {
        System.out.println("Adress email of person who is author of bug: " + adressEmail + ".");
    }

    public int getPiority() {
        return piority;

    }

    public void getStatus() {
        System.out.println("Your bug is " + convertStatusOfBug() + ".");
    }


}
