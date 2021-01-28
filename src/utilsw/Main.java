package utilsw;

import Other.Bug;
import Other.BugReporter;
import Other.User;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ------ PART ONE ----");

        List<Bug> bugs = new ArrayList<>();

        bugs.add(new Bug("Bartek to zgłasza", (new BugReporter("pierwszy@onet.pl", "Bartek", "Kołodziej")), 4));
        bugs.add(new Bug("Stan to zgłasza", (new BugReporter("drugi@onet.pl", "Stan", "Kołodziejczyk")), 6));
        bugs.add(new Bug("Monika to zgłasza", (new BugReporter("drugi@onet.pl", "Monika", "Kołodziejczyk")), 1));
        bugs.add(new Bug("Bartek to zgłasza", (new BugReporter("pierwszy@onet.pl", "Bartek", "Kołodziej")), 4));
        bugs.add(new Bug("Artur to zgłasza", (new BugReporter("trzeci@onet.pl", "Artur", "Kołodziejczyk")), 4));

        for (Bug bug : bugs) {
            System.out.println(bug);

        }
        System.out.println("----PART TWO -----");

        Set<Bug> uniqueBugs = new HashSet<>(bugs);

        for (Bug bug : uniqueBugs) {
            System.out.println(bug);
        }


        System.out.println("----PART THREE -----");
        Set<Bug> sortedUniqueBugsPerDescription = new TreeSet<>(uniqueBugs);


        for (Bug bug : sortedUniqueBugsPerDescription) {
            System.out.println(bug.getDescription());
        }
    }
}

