


public class AlfredTest{

    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        String testdateAnnouncement = alfredBot.dateAnnouncement();
        String testguestGreeting = alfredBot.guestGreeting("Matt", "morning");



        System.out.println(testGreeting);
        System.out.println(testdateAnnouncement);
        System.out.println(testguestGreeting);
    }

}