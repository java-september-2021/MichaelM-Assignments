import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava{
    
    // Print 1-255
    public static void print255(){
        for (int i=1;i<=255;i++){
            System.out.println(i);
        }
    }

    // Print odd numbers between 1-255
    public static void printOdd255(){
        for (int i=0;i<=255;i+=2){
            System.out.println(i);
        }
    }

    // Sigma of 255 AKA Sum to 255
    public static void printSum255(){
        int sum =0;
        for (int i=0;i<=255;i++){
            sum = i+sum;
            System.out.println("Number: " + i + " Sum: " + sum);
        }
    
    }

    // Iterating through an array
    public static void arrayIteration(int [] i){
        for (int j=0;j<i.length;j++){
        System.out.println(i[j]);
        }
    }

    // Find Max
    public static void findMax(int[] arr){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
           if (arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println(max);
    }

    // Array with Odd Numbers
    public static void arrayOdd(){
        ArrayList<Object> y = new ArrayList<Object>();
        for (int i=1;i<=255;i++){
            y.add(i);
        }
        System.out.println(y);
    }

    // Ninja Bonuses (Optional):

    // Get Average
    public static void getAverage(int[] arr){
        int avg = 0;
        int sum = 0;

        for (int i=0;i<arr.length;i++){
            sum = arr[i] +sum;
        }
        avg = sum/arr.length;
        System.out.println(avg);
    }

    // Greater Than Y
    public static void greaterY(int[] arr, int y){
        int counter =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > y){
                counter++;
            }
        }
        System.out.println(counter);

    }

    // Square the values
    public static void squareVal(int[] x){
        for (int i=0;i<x.length;i++){
            x[i]= x[i]*x[i];
        }
        System.out.println(Arrays.toString(x));
    }

    // Eliminate Negative Numbers
    public static void deleteNeg(int[] x){
        for (int i=0;i<x.length;i++){
            if (x[i] <0){
                x[i]=0;
            }
        }
        System.out.println(Arrays.toString(x));
    }

    // Sansei Bonuses (Optional):

    // Max, Min, and Average
    public static int[] minMaxAverage(int[] arr){
        int[] newArr= new int[3];
        int max = arr[0];
        
        for (int i=1;i<arr.length;i++){
            if (arr[i]> max){
                max =arr[i];
            }
            
        }
        newArr[0] = max;
        
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]< min){
                min =arr[i];
            }
        }
        newArr[1] = min;
           
        int avg = 0;
        int sum = 0;

        for (int i=0;i<arr.length;i++){
            sum = arr[i] +sum;
        }
        avg = sum/arr.length;
        newArr[2]= avg ;
        return newArr;



    }

    // Shifting the Values in the Array
    public static void shiftingArray(int[] x){
        for (int i=0; i< x.length; i++){
            if (i == x.length-1){
                x[i] = 0;
                break;
            }
            x[i] = x[i+1];
        }
        System.out.println(Arrays.toString(x));
    }

}