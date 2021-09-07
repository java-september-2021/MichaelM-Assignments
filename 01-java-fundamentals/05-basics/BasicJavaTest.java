import java.util.ArrayList;
import java.util.Arrays;
public class BasicJavaTest{
    public static void main(String[] args) {
        int[] arr2 =  {1,3,5,7,9,13};
        int[] arr1 =  {1,-3,5,-7,9,13};
        int[] arr3 =  {1,5,10,-2};
        // print255();
        BasicJava k = new BasicJava();
        k.print255();
        // printOdd255();
        k.printOdd255();
        // printSum255();
        k.printSum255();
        // arrayIteration(arr2);
        k.arrayIteration(arr1);
        // findMax(arr2);
        k.findMax(arr2);
        // getAverage(arr2);
        k.getAverage(arr2);
        // arrayOdd();
        k.arrayOdd();
        // greaterY(arr2, 2);
        k.greaterY(arr2, 2);
        // squareVal(arr1);
        k.squareVal(arr1);
        // deleteNeg(arr1);
        k.deleteNeg(arr1);
        int[]mma = k.minMaxAverage(arr3);
        System.out.println(Arrays.toString(mma));
        k.shiftingArray(arr3);
    }
}