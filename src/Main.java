public class Main {

    public static void main(String[] args) {

        Bug todayBug = new Bug("'Issue with submit login form'", "stancie@example.pl", 5);

        todayBug.getInformationAboutBug();
        todayBug.getEmailOfAuthor();
        todayBug.getPiority();
        todayBug.getStatus();
    }
}
