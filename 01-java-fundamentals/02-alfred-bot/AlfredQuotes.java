import java.util.Date;
public class AlfredQuotes{

    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod){
        return String.format("Good %s, %s. How are you this fine ?", dayPeriod, name);
    }

    public String dateAnnouncement(){
        return String.format("It is currently %s", new Date());
    }

    public String respondBeforeAlexis(String conversation){
        return "";
    }

}