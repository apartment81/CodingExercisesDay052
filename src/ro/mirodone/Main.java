package ro.mirodone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        ReverseDataArray dataReverse = new ReverseDataArray();

        // dataReverse.DataReverse(new int[]{10, 20, 30, 40, 50});
        // dataReverse.DataReverse(new int[] {0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1});


        int toReverse [][] =  dataReverse.splitInts(new int[] {0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1}, 4);


        for (int[] aToReverse : toReverse) {

            System.out.println("Original array " + Arrays.toString(aToReverse));

            System.out.println("Reversed array " + Arrays.toString(dataReverse.DataReverse(aToReverse)));

            System.out.println("++++++++++++++++++++++++++++++");
        }

        int array [] = {1, 2, 3, 4, 5, 6, 7, 8};
        int reverse2 [][] =  dataReverse.splitInts(array, 2);

        for (int[] rrr:reverse2) {

            System.out.println( Arrays.toString(rrr));
        }



    }
}
