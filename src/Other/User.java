package Other;

import java.util.Objects;

public class User implements Comparable<User> {

        String firstName;
        String lastName;
        String email;
        int age;
        boolean isAdult;

        public User(String firstName, String lastName, String email, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.age = age;
            this.isAdult = true;

        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                isAdult == user.isAdult &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public int compareTo(User o) {
            int compareResult = this.getFirstName().compareTo(o.getFirstName());
            if(compareResult == 0){
                compareResult = this.getLastName().compareTo(o.getLastName());
            }
        return compareResult;
    }
}

