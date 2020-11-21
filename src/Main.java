import Other.Bug;

public class Main {

    public static void main(String[] args) {

        Bug todayBug = new Bug("'Issue with submit login form'", "stancie@example.pl", 5);
        todayBug.setDescription("adsdf");
        todayBug.setAdressEmail("dada.");
        todayBug.setPiority(-1);
        todayBug.setAdressEmail("stanciesi@onet.pl");
        todayBug.getInformationAboutBug();
        todayBug.getEmailOfAuthor();
        int piority = todayBug.getPiority();
        System.out.println(piority);
        todayBug.getStatus();
    }
}
