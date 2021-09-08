import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Puzzling{

    public ArrayList<Integer> getTenRolls(){

        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i=0; i<=10; i++){
            random10.add(rand.nextInt(20)+1);
        }
        return random10;
    }

    public String getRandomLetterWithA(){
        Random rand = new Random();

        String abcString = "abcdefghijklmnopqrstuvwxyz";
        String[] abc = new String[26];
        for (int i=0;i<26;i++){
            abc[i] = String.valueOf((abcString.charAt(i)));
        }
        return abc[rand.nextInt(26)];
    }
    public String getRandLet(){
        Random rand = new Random();
        String abcString = "abcdefghijklmnopqrstuvwxyz";
        char randChar= abcString.charAt(rand.nextInt(26));
        return String.valueOf(randChar);
    }

    public String makePass(){
        String pass ="";
        for (int i=0;i<8;i++){
            pass = pass + getRandLet();
        }
        return pass;
    }

    public ArrayList<String> makeNewPass(int length){
        ArrayList<String> passSet = new ArrayList<String>();
        for (int i=0;i<length; i++){
        passSet.add(makePass());
        }
        return passSet;
    }

    



    }
