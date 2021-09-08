import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class PuzzlingTest{
    
    public static void main(String[] args) {
        // linking my Puzzling.java
        Puzzling k = new Puzzling();


        ArrayList<Integer> randRolls = k.getTenRolls();
        System.out.println(randRolls);
        System.out.println(k.getRandomLetterWithA());
        System.out.println(k.getRandLet());
        System.out.println(k.makePass());
        System.out.println(k.makeNewPass(10));

        




    }
}