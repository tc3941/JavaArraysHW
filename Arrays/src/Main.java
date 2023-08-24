import java.util.Arrays;

public class Main {
    //Write a program to sum all the values of a given Array in Java.
    public static double sumOfArrays(double[] a){
        double sum = 0;
        for(int i = 0; i<a.length; i++){
            sum += a[i];
        }
return sum;
    }

    //Write a public static method called "toPower" that takes in as parameters two integers called size and power.
    public static int[] toPower (int size, int power){
        int[] array = new int [size];
        for(int i = 0; i<array.length;i++)
            array[i] = (int)Math.pow(i,power);

        return array;
    }

    public static void main(String[] args) {
//2, it outputs errors due to typos, but assuming it wasnt intentional it should be 2
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

            if (exampleArray[ i ] > maximum) {

                maximum = exampleArray[ i ];

                index = i;

            }

        }

        System.out.println(index);
        System.out.println("To Power(size 4,power 2) " + Arrays.toString(toPower(4, 2)));
        System.out.println("sum: " + sumOfArrays(exampleArray));


    }
}