package Other;

import java.util.Objects;

public class BugReporter {

    private String adressEmail;
    private String firstName;
    private String secondName;

    public BugReporter(String adressEmail, String firstName, String secondName) {
        this.adressEmail = adressEmail;
        this.firstName = firstName;
        this.secondName = secondName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "BugReporter{" +
                "adressEmail='" + adressEmail + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BugReporter that = (BugReporter) o;
        return Objects.equals(adressEmail, that.adressEmail) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(secondName, that.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adressEmail, firstName, secondName);
    }
}


