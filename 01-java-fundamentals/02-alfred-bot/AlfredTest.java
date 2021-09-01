


public class AlfredTest{

    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        String testdateAnnouncement = alfredBot.dateAnnouncement();
        String testguestGreeting = alfredBot.guestGreeting("Matt", "morning");
        String testrespondBeforeAlexis = alfredBot.respondBeforeAlexis("Alexis!! play some music.");
        String testrespondBeforeAlexis2 = alfredBot.respondBeforeAlexis("Alfred!! play some music.");



        System.out.println(testGreeting);
        System.out.println(testdateAnnouncement);
        System.out.println(testguestGreeting);
        System.out.println(testrespondBeforeAlexis);
        System.out.println(testrespondBeforeAlexis2);
    }

}