package Other;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {


    protected String description;
    protected BugReporter bugReporter;
    protected int piority;
    protected boolean statusOfFindedBug;

    public Bug(String description, BugReporter bugReporter, int piority) {
        this.description = description;
        this.bugReporter = bugReporter;
        this.piority = piority;
        this.statusOfFindedBug = isStatusOfFindedBug();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return piority == bug.piority &&
                statusOfFindedBug == bug.statusOfFindedBug &&
                description.equals(bug.description) &&
                bugReporter.equals(bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, bugReporter, piority, statusOfFindedBug);
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



    public void setPiority(int piority) {
        if (piority < 1 || piority > 5) {
            System.out.println("Value of piority must be from range 1 - 5.");
        } else {
            this.piority = piority;
        }
    }

    public void setStatusOfFindedBug(boolean statusOfFindedBug) {
        notifyStatusChange();
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

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public void getInformationAboutBug() {
        System.out.println("All information about bugs: Description: " + description + ", Email of person who created: " + getBugReporter().getAdressEmail() + ", Piority: " + piority + " and Status of bugs: " + convertStatusOfBug() + ".");
    }

    public void getEmailOfAuthor() {
        System.out.println("Adress email of person who is author of bug: " + getBugReporter().getAdressEmail() + ".");
    }

    public int getPiority() {
        return piority;

    }

    public void getStatus() {
        System.out.println("Your bug is " + convertStatusOfBug() + ".");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "description='" + description + '\'' +
                ", bugReporter=" + bugReporter +
                ", piority=" + piority +
                ", statusOfFindedBug=" + statusOfFindedBug +
                '}';
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Status of bug is changed!!!");
    }

    @Override
    public int compareTo(Bug bug) {
        return (this.getDescription().compareTo(bug.getDescription()));
    }
}
