
import java.util.HashMap;


public class SongMap{
    public static void trackList(){
    // ● Create a trackList of type HashMap
    HashMap<String, String> testList = new HashMap<String, String>();
    
    // ● Add in at least 4 songs that are stored by title
        testList.put("Mr. Mom", "Mr Mom is comming for you!!");
        testList.put("My love..", "My love is only for you...");
        testList.put("Green tomatoes", "Fry those green Tomatoes!!!");
        testList.put("Java is fun!", "As fun as pulling teeth...");
        
        System.out.println(testList.get("Java is fun!"));
        // ● Print out all the track names and lyrics in the format Track: Lyrics
       
            
            for (HashMap.Entry<String, String> track : testList.entrySet()){
                System.out.println(track.getKey() +": " + track.getValue());
            }


    }
    
}