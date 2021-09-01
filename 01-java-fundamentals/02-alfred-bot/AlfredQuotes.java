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
        if (conversation.indexOf("Alexis") > -1){

            return "She really can't help.. How may i be of assitance??";
        }
        if (conversation.indexOf("Alfred") > -1){

            return "Right away, How can i be of assitance??";
        }
        return "Right. And with that i shall retire.";
    }

}